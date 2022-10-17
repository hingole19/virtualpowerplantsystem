package virtual.powerplant.com.utility;

public class BaseResponse {

	private int responseCode;
	private String responseMessage;
	private Object responseBody;
	private long totalRecords;

	public BaseResponse(int code, String message) {
		this.responseCode = code;
		this.responseMessage = message;
	}

	public BaseResponse() {
	}

	public BaseResponse(int code, String message, String body) {
		this.responseCode = code;
		this.responseMessage = message;
		this.responseBody = body;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String success) {
		this.responseMessage = success;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}
}
