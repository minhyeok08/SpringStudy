package com.sist.commons;

import java.sql.SQLException;
import java.io.*;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
// Spring : 반복 코딩(X)
@ControllerAdvice
public class CommonException {
	@ExceptionHandler(RuntimeException.class)
	public void runtimeException(RuntimeException ex)
	{
		System.out.println("======== RuntimeException ========");
		ex.printStackTrace();
		System.out.println("==================================");
	}
	
	@ExceptionHandler(SQLException.class)
	public void sqlException(SQLException ex)
	{
		System.out.println("======== SQLException ========");
		ex.printStackTrace();
		System.out.println("==================================");
		
	}
	
	@ExceptionHandler(IOException.class)
	public void IOException(IOException ex)
	{
		System.out.println("======== IOException ========");
		ex.printStackTrace();
		System.out.println("==================================");
	}
	
	@ExceptionHandler(Exception.class)
	public void Exception(Exception ex)
	{
		System.out.println("======== Exception ========");
		ex.printStackTrace();
		System.out.println("==================================");
	}
}
