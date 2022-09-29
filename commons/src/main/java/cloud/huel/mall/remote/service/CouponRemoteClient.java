package cloud.huel.mall.remote.service;

import cloud.huel.mall.remote.fallback.CouponRemoteFallbackFactory;
import cloud.huel.mall.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 张晓华
 * @date 2022-9-28
 */
@FeignClient(value = "guli-coupon", fallbackFactory = CouponRemoteFallbackFactory.class)
public interface CouponRemoteClient {

	@GetMapping("/coupon/sms-coupon/r")
	Result result();





}
