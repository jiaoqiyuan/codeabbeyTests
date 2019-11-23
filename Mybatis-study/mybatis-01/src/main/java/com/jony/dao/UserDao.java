package com.jony.dao;

import com.jony.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserDao {
    // 查询全部用户
    List<User> getUserList();

    // 模糊查询，使用 like 查询
    List<User> getUserLike(String value);

    // 根据 id 查询用户
    User getUserById(int id);

    // 根据 map 查询用户
    User getUserByMap(Map<String, Object> map);

    //插入一个用户
    int addUser(User user);

    // 根据 map 插入一个用户
    int addUserWithMap(Map<String, Object> map);

    //更新一个用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
