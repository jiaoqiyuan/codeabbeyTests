package com.jony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 被注解的这个类中的所有方法，如果返回的是 String 类型的数据，
 * 并且如果有具体的页面可以跳转，就会被视图解析器解析
 */
@Controller
public class ControllerTest2 {

    @RequestMapping("/test2")
    public String test1(Model model) {
        model.addAttribute("msg", "ControllerTest2.");
        return "test";
    }
}
