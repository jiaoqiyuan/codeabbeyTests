package com.jony.pojo;

import java.util.List;
import java.util.Objects;

public class Teacher07 {
  private int id;
  private String name;
  //一个老师有多个学生
  private List<Student07> students;

  public List<Student07> getStudents() {
    return students;
  }

  public void setStudent(List<Student07> students) {
    this.students = students;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teacher07 teacher = (Teacher07) o;
    return id == teacher.id && Objects.equals(name, teacher.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    return "Teacher07{" + "id=" + id
        + ", name='" + name + '\''
        + ", students=" + students + '}';
  }

  public Teacher07() {
  }

  /**
   * 构造函数.
   *
   * @param id id
   * @param name name
   * @param students students
   */
  public Teacher07(int id, String name, List<Student07> students) {
    this.id = id;
    this.name = name;
    this.students = students;
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
}
