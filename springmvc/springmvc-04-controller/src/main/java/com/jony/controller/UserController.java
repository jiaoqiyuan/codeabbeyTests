package com.jony.controller;

import com.jony.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String user(@RequestParam("username") String name, Model model) {
        // 1. 接收前端参数
        System.out.println("Receive name is: " + name);
        // 2. 将返回结果传递给前端
        model.addAttribute("msg", name);
        // 3. 视图跳转
        return "test";
    }

    // 前端接收的是一个对象
    @RequestMapping("/t2")
    public String user2(User user) {
        System.out.println(user);
        return "test";
    }

    @RequestMapping("/t3")
    public String user3(ModelMap modelMap) {
        modelMap.addAttribute("msg", "user3");
        return "test";
    }
}
