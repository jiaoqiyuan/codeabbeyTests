package com.jony.pojo;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("Get user from dao.");
    }
}
