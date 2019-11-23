package com.jony.dao;

import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    SqlSession sqlSession = null;
    UserDao userDao = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Test
    public void testGetUserList() {
        // 调用接口
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById() {
        //调用接口
        User user = userDao.getUserById(1);
        System.out.println(user.getName());
    }

    @After
    public void after() {
        sqlSession.close();
    }
}
