package cloud.huel.mall;

import cloud.huel.mall.vo.Result;
import org.junit.Test;

/**
 * @author 张晓华
 * @date 2022-9-28
 */
public class VoTest {

	@Test
	public void testResult() {
		Result<Object> result = Result.ofSuccess();
		System.out.println(result);
		Result<Object> error = Result.ofError();
		System.out.println(error);
		Result<Integer> success = Result.ofSuccess(100);
		System.out.println(success);
	}





}
