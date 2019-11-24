package com.jony.dao;

import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    public SqlSession sqlSession = null;
    public UserMapper userMapper = null;
    public Logger logger = null;
    @Before
    public void before() {
        // 获取session对象
        sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        userMapper = sqlSession.getMapper(UserMapper.class);
        logger = Logger.getLogger(UserDaoTest.class);
    }

    @Test
    public void testGetUserById() {
        User userById = userMapper.getUserById(3);
        System.out.println(userById);
    }

    @Test
    public void testLog4j() {
        Logger logger = Logger.getLogger(UserDaoTest.class);
        logger.info("Test log4j info!");
        logger.debug("Test log4j debug!");
        logger.error("Test log4j error!");
    }

    @Test
    public void testGetUserByLimit() {
        Map<String, Object> map = new HashMap<>();
        map.put("startIndex", 1);
        map.put("pageSize", 2);
        List<User> userByLimit = userMapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserByRowBounds() {
        // 通过 Java 层面实现查询
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> list = sqlSession.selectList("com.jony.dao.UserMapper.getUserByRowBounds",
                null, rowBounds);
        for (User user : list) {
            //System.out.println(user);
            logger.info(user);
        }
    }

    @After
    public void after() {
        sqlSession.close();
    }
}