package com.jony.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jony.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody // 增加 ResponseBody 后就不进入视图解析器，直接返回一个字符串
    public String json1() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user = new User(1, "焦启源", 10);

        return mapper.writeValueAsString(user);
    }
}
