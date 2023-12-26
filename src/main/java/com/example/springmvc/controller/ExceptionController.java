package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xieyunpeng
 * @Date 2023/12/26 15:51
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {NullPointerException.class,ArithmeticException.class})
    public String testException(Exception ex , Model model){
        model.addAttribute("ex",ex);
        return "error";

    }




}
