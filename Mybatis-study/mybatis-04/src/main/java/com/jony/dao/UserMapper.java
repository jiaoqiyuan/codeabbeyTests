package com.jony.dao;

import com.jony.pojo.User;

public interface UserMapper {

    // 根据 id 查询用户
    User getUserById(int id);
}
