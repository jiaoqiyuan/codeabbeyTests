package com.jony.pojo;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private Teacher teacher;

    public Student() {
    }

    public Student(int id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
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

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", teacher=" + teacher +
                '}';
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                name == student.name &&
                teacher.equals(student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teacher);
    }
}
