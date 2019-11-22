package com.jony.dao;

import com.jony.pojo.User;
import java.util.List;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList();

    // 根据 id 查询用户
    User getUserById(int id);
}
