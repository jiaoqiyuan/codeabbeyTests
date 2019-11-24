package com.jony.dao;


import com.jony.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    // 根据 id 查询用户
    @Select("select * from user")
    List<User> getUsers();
}
