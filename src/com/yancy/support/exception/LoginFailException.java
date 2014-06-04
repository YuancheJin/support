package com.yancy.support.exception;

public class LoginFailException extends RuntimeException {

	private static final long serialVersionUID = 3409299035679575703L;

	public LoginFailException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginFailException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public LoginFailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public LoginFailException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
