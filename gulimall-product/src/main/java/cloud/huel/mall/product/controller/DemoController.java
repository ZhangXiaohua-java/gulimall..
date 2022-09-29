package cloud.huel.mall.product.controller;

import cloud.huel.mall.remote.service.CouponRemoteClient;
import cloud.huel.mall.vo.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author 张晓华
 * @date 2022-9-29
 */
@RefreshScope
@RequestMapping("/demo")
@RestController
public class DemoController {

	@Value("${user.name}")
	private String name;

	@Value("${user.age}")
	private Integer age;

	@Resource
	private CouponRemoteClient couponRemoteClient;

	@GetMapping("/config")
	public Result config() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("age", age);
		return Result.ofSuccess().setData(map);
	}

	@GetMapping("/r")
	public Result getMessage() {
		return couponRemoteClient.result();
	}




}
