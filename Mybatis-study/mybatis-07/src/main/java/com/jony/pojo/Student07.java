package com.jony.pojo;

import java.util.Objects;

public class Student07 {
    private int id;
    private String name;
    private int tid;

    public Student07() {
    }

    public Student07(int id, String name, int tid) {
        this.id = id;
        this.name = name;
        this.tid = tid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacher() {
        return tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", tid=" + tid +
                '}';
    }

    public void setTeacher(int tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student07 student = (Student07) o;
        return id == student.id &&
                name == student.name &&
                tid == student.tid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tid);
    }
}
