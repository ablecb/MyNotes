package com.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @RequestMapping("buy")
    @ResponseBody
    public String buy(){
        System.out.println("...............................................");
        return "buy success...........";
    }
    @RequestMapping("/ok")
    public String ok(){
        return "ok";//到我们自定义的appconfig子容器，找到/WEB-INFO/pages/  ok.jsp
    }
}
