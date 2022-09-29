package cloud.huel.mall.enums;

/**
 * @author 张晓华
 * @date 2022-9-28
 */
public enum ResponseStatus {

	OK(200, "OK"),
	ERROR(500, "error")
	;


	private Integer code;

	private String msg;


	ResponseStatus(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}


	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}


}
