package cloud.huel.mall.remote.fallback;

import cloud.huel.mall.remote.service.CouponRemoteClient;
import cloud.huel.mall.vo.KVObject;
import cloud.huel.mall.vo.Result;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author 张晓华
 * @date 2022-9-29
 */
@Component
@Slf4j
public class CouponRemoteFallbackFactory implements FallbackFactory<CouponRemoteClient> {


	@Override
	public CouponRemoteClient create(Throwable throwable) {
		if (Objects.nonNull(throwable)) {
			log.error("Feign异常信息 {}", throwable.getLocalizedMessage());
		}
		return new CouponRemoteClientImpl();
	}


	public Result defaultFallbackLogic() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("tip", "服务降级");
		return Result.ofError().setData(map);
	}

	public class CouponRemoteClientImpl implements CouponRemoteClient{
		@Override
		public Result result() {
			return defaultFallbackLogic();
		}
	}

}
