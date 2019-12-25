package com.jony.pojo;

public class User {
    private String name;

//    public User() {
//        System.out.println("User's constructor without args.");
//    }

    public User(String name) {
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
