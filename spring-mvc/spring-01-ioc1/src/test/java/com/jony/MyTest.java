package com.jony;

import com.jony.dao.UserDaoMysql;
import com.jony.service.UserService;
import com.jony.service.UserServiceImpl;
import org.junit.Test;

public class MyTest {
    @Test
    public void testGetUser() {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysql());
        userService.getUser();
    }
}
