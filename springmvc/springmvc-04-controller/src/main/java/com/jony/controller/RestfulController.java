package com.jony.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {
//    @RequestMapping(value="/add/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String restfulTest(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a+b;
        model.addAttribute("msg", a + " + " + b + " = " + res);
        return "test";
    }

    @PostMapping("/add/{a}/{b}")
    public String restfulTest1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a+b;
        model.addAttribute("msg", "res2 " + a + " + " + b + " = " + res);
        return "test";
    }
}
