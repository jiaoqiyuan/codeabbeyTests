package com.jony.dao;

import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    public SqlSession sqlSession = null;
    public UserMapper userDao = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        userDao = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testGetUserList() {
        List<User> list = userDao.getUserList();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }
}