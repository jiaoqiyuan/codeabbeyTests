package com.jony.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于在xml中配置了<bean id="people" class="com.jony.pojo.People"/>
@Component
public class User {
    @Value("MMMMMMMM")
    public String name = "JonyChiao";
}
