package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xieyunpeng
 * @Date 2023/12/25 20:20
 */
@Controller
public class TestController {

    @RequestMapping("/test_view")
    public String testThymeleafView() {
        return "test_view";
    }



    @RequestMapping("/errorHappen")
    public String errorHappen(){
        System.out.println(1/0);
        return "success";

    }
}
