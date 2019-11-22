package com.jony.dao;

import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        // 获取session对象
        SqlSession sqlSession = MybatisUtils.getSqlSessionFactory();
        // getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        // 调用接口
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
