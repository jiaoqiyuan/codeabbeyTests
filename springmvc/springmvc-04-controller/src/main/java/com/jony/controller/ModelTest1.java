package com.jony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String modelTest1(HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        model.addAttribute("msg", "modelTest1!");
        // redirect 重定向
        return "redirect:/form.jsp";
    }
}
