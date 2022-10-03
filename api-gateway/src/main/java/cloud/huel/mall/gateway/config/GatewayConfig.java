package cloud.huel.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Collections;

/**
 * @author 张晓华
 * @date 2022-10-2
 */
@Configuration
public class GatewayConfig {


	/**
	 * 网关跨域配置
	 *
	 * @return CorsWebFilter
	 */
	@Bean
	public CorsWebFilter corsWebFilter() {
		UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedMethods(Collections.singletonList("*"));
		corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
		corsConfiguration.setAllowedOrigins(Collections.singletonList("*"));
		corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		CorsWebFilter corsWebFilter = new CorsWebFilter(corsConfigurationSource);
		return corsWebFilter;
	}

}
