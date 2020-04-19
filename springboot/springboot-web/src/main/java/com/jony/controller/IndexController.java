package com.jony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * templates目录下的所有页面只能通过Controller跳转
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "hello, springboot");
        model.addAttribute("utext", "<h1>hello, utext.</h1>");
        model.addAttribute("users", Arrays.asList("user1", "user2", "user3"));
        return "index";
    }
}
