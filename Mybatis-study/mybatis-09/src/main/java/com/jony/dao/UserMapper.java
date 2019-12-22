package com.jony.dao;

import com.jony.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 根据 id 查询用户
    User getUserById(@Param("id") int id);

    // 根据 map 查询用户
    User getUserByMap(Map<String, Object> map);

    //更新一个用户
    int updateUser(User user);
}
