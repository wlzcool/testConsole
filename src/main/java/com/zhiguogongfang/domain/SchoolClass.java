package com.zhiguogongfang.domain;

import java.util.List;

public class SchoolClass {
    private Integer id;
    private String name;
    private String userName;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
