package com.jony.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {
    private String name;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }
}
