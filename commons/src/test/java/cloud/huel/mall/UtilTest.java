package cloud.huel.mall;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;

/**
 * @author 张晓华
 * @date 2022-9-29
 */
public class UtilTest {


	@Test
	public void getCpuData() {
		RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
		System.out.println(runtimeMXBean.getName());
		// JVM运行时间,单位ms
		long uptime = runtimeMXBean.getUptime();
		// 虚拟机名称
		String vmName = runtimeMXBean.getVmName();
		System.out.println(vmName);
		System.out.println(uptime);
	}




}
