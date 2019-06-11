package com.enjoy.servlet;

import com.enjoy.others.OrderFilter;
import com.enjoy.others.OrderListener;
import com.enjoy.others.OrderServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;
@HandlesTypes(value = {JamesService.class})
public class JamesServletContainerInitializer implements ServletContainerInitializer {
    //加载时输出
    //ServletContext:...代表当前web应用,注册3组件
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("感兴趣的类型");
        for(Class<?> claz:set){
            System.out.println(claz);
        }
        //注册OrderServlet组件
        ServletRegistration.Dynamic orderServlet = servletContext.addServlet("orderServlet", new OrderServlet());
        orderServlet.addMapping("/orderTest");
        //注册监听器listener
        servletContext.addListener(OrderListener.class);
        //注册filter
        FilterRegistration.Dynamic filter = servletContext.addFilter("orderFilter", OrderFilter.class);
        filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }
}
