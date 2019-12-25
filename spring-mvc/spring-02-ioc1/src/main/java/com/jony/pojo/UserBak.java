package com.jony.pojo;

public class UserBak {
    private String name;

    public UserBak() {
        System.out.println("UserBak's constructor without args.");
    }

    public UserBak(String name) {
        this.name = name;
        System.out.println("User's constructor with args.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
