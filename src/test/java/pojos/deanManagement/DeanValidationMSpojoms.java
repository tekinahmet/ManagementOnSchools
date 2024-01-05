package pojos.deanManagement;

import java.io.Serializable;

public class DeanValidationMSpojoms implements Serializable {
	private Objectpojoms object;
	private String message;
	private String httpStatus;

	public DeanValidationMSpojoms() {
	}

	public DeanValidationMSpojoms(Objectpojoms object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(Objectpojoms object){
		this.object = object;
	}

	public Objectpojoms getObject(){
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
			"DeanValidationMSpojoms{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}