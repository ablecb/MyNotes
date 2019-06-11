package com.enjoy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;


//对我们非Controller层进行bean注入
@ComponentScan(value = "com.enjoy",includeFilters = {
        @Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
@EnableWebMvc
public class JamesAppConfig implements WebMvcConfigurer {
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //比如我们想用JSP解析器，默认的所有页面都从/WEB_INFO/aaa.jsp
        registry.jsp("/WEB-INF/pages/",".jsp");
    }



    //静态资源的访问
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JamesInterceptor()).addPathPatterns("/**");
    }
}
