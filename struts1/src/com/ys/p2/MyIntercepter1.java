package com.ys.p2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyIntercepter1 implements Interceptor{

	@Override
	public void destroy() {
		
	}

	@Override
	public void init() {
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("MyIntercepter1...........begin...............");
		arg0.invoke();
		return null;
	}

}
