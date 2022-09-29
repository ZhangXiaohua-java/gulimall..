package cloud.huel.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 张晓华
 * @date 2022-9-28
 */

@MapperScan(basePackages = {"cloud.huel.mall.order.mapper"})
@EnableDiscoveryClient
@SpringBootApplication
public class OrderApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class);
	}



}
