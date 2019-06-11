package com.enjoy.config;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


//对我们非Controller层进行bean注入
@ComponentScan(value = "com.enjoy",excludeFilters = {
        @Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
})
public class JamesRootConfig {

}
