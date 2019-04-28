package com.alok.restfullwebservices.helloworld;

public class HelloWorldBean {
	
	private String message ;

	public HelloWorldBean(String string) {
		this.message=string;
	}

	

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
