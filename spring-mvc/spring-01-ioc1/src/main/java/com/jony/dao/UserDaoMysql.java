package com.jony.dao;

public class UserDaoMysql implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Get user from mysql dao.");
    }
}
