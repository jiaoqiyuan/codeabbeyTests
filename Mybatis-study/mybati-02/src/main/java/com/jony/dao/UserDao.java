package com.jony.dao;

import com.jony.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList();

    // 根据 id 查询用户
    User getUserById(int id);

    //插入一个用户
    int addUser(User user);

    //更新一个用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
