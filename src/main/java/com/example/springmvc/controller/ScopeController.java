package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author xieyunpeng
 * @create 2023/12/10
 * <p>
 * 域对象测试
 */
@Controller
public class ScopeController {
    public static final String SUCCESS = "success";

    @RequestMapping("/testRequestByServletApi")
    public String testRequestByServletApi(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,scope,test");
        return SUCCESS;
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        // 处理模型数据，
        mav.addObject("testRequestScope", "hello,ModelAndView");
        // 设置视图名称
        mav.setViewName(SUCCESS);
        return mav;
    }


    @RequestMapping("/testModel")
    public String testModelAndView(Model model) {
        model.addAttribute("testRequestScope", "hello,Model");
        return SUCCESS;
    }


    @RequestMapping("/testMap")
    public String testMap(Map<String , Object> map) {
        map.put("testRequestScope", "hello,map");
        return SUCCESS;
    }

    @RequestMapping("/testModelMap")
    public String testMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,modelMap");
        return SUCCESS;
    }


    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSession", "hello,session");
        return SUCCESS;
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplication", "hello,Application");
        return SUCCESS;
    }


}
