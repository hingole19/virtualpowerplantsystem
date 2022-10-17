package virtual.powerplant.com.constants;

/**
 * @author Harish Ingole
 * @since 0.0.1
 */
public enum EResponse {
	SUCCESS(200, "SUCCESS"), FAILED(424, "FAILED");

	private int code;
	private String message;

	private EResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}

	EResponse(int l) {
		this.code = l;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
