package com.example.MavenProjectUsingEasyMock.exception;

public class NoDataFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
//NoArgsConst
	public NoDataFoundException() {
		
	}
	//AllArgsConst
	public NoDataFoundException(String msg) {
		super(msg);
	}
}
