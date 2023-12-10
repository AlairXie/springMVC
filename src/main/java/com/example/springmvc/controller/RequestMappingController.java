package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author xieyunpeng
 * @create 2023/12/10
 */
@Controller
public class RequestMappingController {

    @RequestMapping(value = {"/successs", "/test"}
            , method = {RequestMethod.GET}
            , params = {"userName","!userId","order=123","id!=1"})
    public String toSuccess(@RequestParam("userName")String userName) {
        return "success";
    }

    @GetMapping("/getIndex")
    public String toIndex() {
        return "/";
    }


    @GetMapping("/getRequestHeader")
    public String toIndex(@RequestHeader("Host")String host,@CookieValue("Idea-a3e78efe")String cookieId) {
        System.out.println(host);
        System.out.println(cookieId);
        return "success";
    }

}
