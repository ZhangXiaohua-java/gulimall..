package cloud.huel.mall.vo;

import cloud.huel.mall.enums.ResponseStatus;

/**
 * @author 张晓华
 * @date 2022-9-28
 */
public final class Result<R> {

	private Integer code;

	private String msg;

	private R data;

	private Result() { }

	public Result(ResponseStatus responseStatus) {
		this.code = responseStatus.getCode();
		this.msg = responseStatus.getMsg();
	}

	public Result(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Result(Integer code, String msg, R data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public static <R> Result<R> ofSuccess() {
		return new Result<>(ResponseStatus.OK);
	}

	public static <R> Result<R> ofError() {
		return new Result<>(ResponseStatus.ERROR);
	}

	public static <R> Result ofSuccess(R data) {
		return Result.ofSuccess().setData(data);
	}

	public static <R> Result ofError(R data) {
		return new Result<>(ResponseStatus.ERROR).setData(data);
	}


	public Result<R> setCode(Integer code) {
		this.code = code;
		return this;
	}

	public Result<R> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public Result<R> setData(R data) {
		this.data = data;
		return this;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public R getData() {
		return data;
	}

	@SuppressWarnings({"all"})
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Result<?> result = (Result<?>) o;

		if (code != null ? !code.equals(result.code) : result.code != null) return false;
		if (msg != null ? !msg.equals(result.msg) : result.msg != null) return false;
		return data != null ? data.equals(result.data) : result.data == null;
	}

	@Override
	public int hashCode() {
		int result = code != null ? code.hashCode() : 0;
		result = 31 * result + (msg != null ? msg.hashCode() : 0);
		result = 31 * result + (data != null ? data.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Result{" +
				"code=" + code +
				", msg='" + msg + '\'' +
				", data=" + data +
				'}';
	}
}
