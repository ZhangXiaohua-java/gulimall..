package cloud.huel.mall.util;

import org.apache.http.client.HttpClient;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.SocketConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author 张晓华
 * @date 2022-10-1
 */
public final class HttpUtil {

	private static Integer initialPoolSize = 10;

	private static Integer maxSize = 20;
	private static PoolingHttpClientConnectionManager connectionManager;

	private static LinkedBlockingDeque<HttpClient> httpClients;

	private static ThreadLocal<Integer> threadLocal = new ThreadLocal() {
		@Override
		protected Object initialValue() {
			return Integer.valueOf(0);
		}
	};

	static {
		connectionManager =
				new PoolingHttpClientConnectionManager(60, TimeUnit.SECONDS);
		// 每个站点最多同时有10个连接工作
		connectionManager.setDefaultMaxPerRoute(10);
		connectionManager.setMaxTotal(100);
		ConnectionConfig connectionConfig = ConnectionConfig.custom()
				.setCharset(Charset.forName("UTF-8"))
				.build();
		SocketConfig socketConfig = SocketConfig.custom()
				.setSoTimeout(3000)
				.setSoKeepAlive(true).build();
		connectionManager.setDefaultConnectionConfig(connectionConfig);
		connectionManager.setDefaultSocketConfig(socketConfig);
		initialize();
	}

	/**
	 * 获取连接资源
	 *
	 * @return
	 */
	private static HttpClient getResource() {
		CloseableHttpClient httpClient = HttpClients.custom()
				.setConnectionManager(connectionManager)
				.setUserAgent("")
				.setConnectionTimeToLive(1, TimeUnit.MINUTES)
				.build();
		return httpClient;
	}

	/**
	 * HttpClient简易连接池的初始化操作
	 */
	public static void initialize() {
		httpClients = new LinkedBlockingDeque<>();
		for (int i = 0; i < initialPoolSize; i++) {
			try {
				httpClients.put(getResource());
			} catch (InterruptedException e) {
				httpClients.clear();
				throw new RuntimeException("初始化失败", e);
			}
		}

	}

	/**
	 * 获取连接对象
	 *
	 * @return 连接资源
	 * @throws InterruptedException 线程如果一直拿不到连接最多重试三次就会被中断
	 */
	public static HttpClient getClient() throws InterruptedException {
		if (httpClients.size() > 0) {
			HttpClient httpClient = httpClients.removeFirst();
			return httpClient;
		} else if (initialPoolSize < maxSize) {
			HttpClient httpClient = getResource();
			return httpClient;
		} else {
			Integer count = threadLocal.get();
			if (count < 3) {
				System.out.println("线程等待");
				TimeUnit.SECONDS.sleep(3);
				threadLocal.set(++count);
				return getClient();
			} else {
				throw new RuntimeException("Timeout ...");
			}

		}
	}

	/**
	 * 释放对HttpClient资源的占用,重新放回连接池
	 *
	 * @param httpClient 连接资源
	 */
	public static void close(HttpClient httpClient) {
		if (Objects.isNull(httpClient)) {
			throw new RuntimeException("对无效的资源操作异常");
		}
		try {
			httpClients.putLast(httpClient);
		} catch (InterruptedException e) {
			System.err.println("error");
			throw new RuntimeException(e);
		}
	}


	public static void main(String[] args) throws InterruptedException {
		try {
			for (int i = 0; i < 15; i++) {
				HttpClient client = getClient();
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(client);
				close(client);
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println(httpClients.size());

	}


	public static String call(String url) {

		return "";
	}


}
