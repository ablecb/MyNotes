package com.ys.p2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyIntercepter2 extends AbstractInterceptor{

	

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("MyIntercepter2...........begin...............");
		arg0.invoke();
		return null;
	}

}
