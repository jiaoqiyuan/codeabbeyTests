package com.jony.pojo;

public class UserDaoMysql implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Get user from mysql dao.");
    }
}
