package cloud.huel.mall.coupon.controller;


import cloud.huel.mall.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author 张晓华
 * @since 2022-09-28
 */
@RestController
@RequestMapping("/coupon/sms-coupon")
public class SmsCouponController {

	@GetMapping("/r")
	public Result result() {
		return Result.ofSuccess().setData("满1000减300");
	}




}

