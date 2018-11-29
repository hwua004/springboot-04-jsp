package com.hwua.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        /**
         * spring.mvc.view.prefix=/WEB-INF/view/
         * spring.mvc.view.suffix=.jsp
         * WEB-INF/view/hello.jsp
         */

        return "hello";
    }

}
