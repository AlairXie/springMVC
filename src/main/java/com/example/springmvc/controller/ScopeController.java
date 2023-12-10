package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xieyunpeng
 * @create 2023/12/10
 *
 * 域对象测试
 */
@Controller
public class ScopeController {


    @RequestMapping("/testRequestByServletApi")
    public String testRequestByServletApi(HttpServletRequest request){
        request.setAttribute("testScope","hello,scope,test");
        return "scope";
    }
}
