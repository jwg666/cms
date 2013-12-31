package com.neusoft.util;


public class LoginContextUtil {
	private static final ThreadLocal<LoginContext> CONTEXT = new ThreadLocal<LoginContext>();
	private LoginContextUtil(){
	}
	public static void put(LoginContext context){
		CONTEXT.set(context);
	}
	public static LoginContext get(){
		return CONTEXT.get();
	}
	public static void clear(){
		CONTEXT.remove();
	}
}
