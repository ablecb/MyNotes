package com.enjoy.web;

import com.enjoy.config.JamesAppConfig;
import com.enjoy.config.JamesRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
    //web容器启动的时候创建的对象，调用此方法来初始化容器以前的一个控制器
public class JamesWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //根容器
    protected Class<?>[] getRootConfigClasses() {
        return  new Class<?>[]{JamesRootConfig.class};
    }
    //子容器
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{JamesAppConfig.class};
    }
    //获取dispatcherservlet的映射信息
    //拦截所有请求:(静态资源,js css png）,但是不包括*.jsp
    //jsp的解析是tomcat的jsp引擎解析
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
