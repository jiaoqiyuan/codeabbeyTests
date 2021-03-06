package com.jony.dao;

import com.jony.pojo.Teacher07;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TeacherMapper07 {
  //获取老师
  List<Teacher07> getTeachers();

  // 获取指定老师及其所有学生
  Teacher07 getTeacher(@Param("tid") int id);
}