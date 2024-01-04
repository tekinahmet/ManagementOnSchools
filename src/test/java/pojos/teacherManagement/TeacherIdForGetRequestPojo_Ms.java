package pojos.teacherManagement;

import java.io.Serializable;

public class TeacherIdForGetRequestPojo_Ms implements Serializable {
	private ObjectPojo_MS object;
	private String message;
	private String httpStatus;

	public TeacherIdForGetRequestPojo_Ms() {
	}

	public TeacherIdForGetRequestPojo_Ms(ObjectPojo_MS object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojo_MS object){
		this.object = object;
	}

	public ObjectPojo_MS getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"TeacherIdForGetRequestPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}