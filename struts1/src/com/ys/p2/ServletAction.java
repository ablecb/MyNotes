package com.ys.p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

public class ServletAction implements ServletRequestAware,ServletResponseAware{
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public void s1(){
		try {
			HttpServletRequest req = ServletActionContext.getRequest();
			
			String id = req.getParameter("id");
			
			
			HttpServletResponse resp = ServletActionContext.getResponse();
			
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter pw = resp.getWriter();
			
			pw.write("hello:"+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void s2(){
		try {
			
			
			String id = request.getParameter("id");
			
			
			
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			
			pw.write("hello:"+id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		response = arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		request = arg0;
	}
	
}
