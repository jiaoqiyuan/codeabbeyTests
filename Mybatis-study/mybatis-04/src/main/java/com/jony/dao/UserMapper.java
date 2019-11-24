package com.jony.dao;

import com.jony.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    // 根据 id 查询用户
    User getUserById(int id);

    // 分页查询
    List<User> getUserByLimit(Map<String, Object> map);

    // RowBounds 分页，不推荐使用
    List<User> getUserByRowBounds();
}
