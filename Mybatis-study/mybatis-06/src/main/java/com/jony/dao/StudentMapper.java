package com.jony.dao;

import com.jony.pojo.Student;

import java.util.List;

public interface StudentMapper {
    // 查询所有学生以及对应老师的信息
    List<Student> getStudent();

    List<Student> getStudent2();
}
