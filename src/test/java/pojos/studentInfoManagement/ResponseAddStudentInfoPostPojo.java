package pojos.studentInfoManagement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseAddStudentInfoPostPojo implements Serializable {
	private ObjectPojo object;
	private String message;
	private String httpStatus;

	public ResponseAddStudentInfoPostPojo() {
	}

	public ResponseAddStudentInfoPostPojo(ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public ObjectPojo getObject() {
		return object;
	}

	public void setObject(ObjectPojo object) {
		this.object = object;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(String httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return "ResponseAddStudentInfoPostPojo{" +
				"object=" + object +
				", message='" + message + '\'' +
				", httpStatus='" + httpStatus + '\'' +
				'}';
	}
}