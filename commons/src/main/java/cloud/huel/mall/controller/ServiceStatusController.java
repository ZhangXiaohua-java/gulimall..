package cloud.huel.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张晓华
 * @date 2022-9-29
 */
@RestController
public class ServiceStatusController {


	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}



}
