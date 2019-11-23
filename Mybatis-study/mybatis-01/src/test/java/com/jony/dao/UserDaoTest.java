package com.jony.dao;

import com.jony.pojo.User;
import com.jony.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    public SqlSession sqlSession = null;
    public UserDao userDao = null;
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
            System.out.println(user.getName());
        }
    }

    @Test
    public void testGetUserLike() {
        List<User> list = userDao.getUserLike("T%");
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById() {
        // 调用接口
        User user = userDao.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetUserByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Tom");
        User user = userDao.getUserByMap(map);
        System.out.println(user);
    }

    @Test
    public void testAddUser() {
        // 调用 addUser 接口
        User user = new User(4, "Jim", "1234569");
        if (userDao.addUser(user) > 0) {
            System.out.println("插入成功！");
        }
        // CRUD 需要提交事务才会生效
        sqlSession.commit();
    }

    @Test
    public void testAddUserWithMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 4);
        map.put("userName", "JIM");
//        map.put("password", "2468");
        userDao.addUserWithMap(map);
        sqlSession.commit();
    }

    @Test
    public void testUpdateUser() {
        User user = new User(4, "JIM", "123459");
        userDao.updateUser(user);
        sqlSession.commit();
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(4);
        sqlSession.commit();
    }

    @After
    public void after() {
        sqlSession.close();
    }
}
