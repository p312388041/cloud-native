package com.chong.study.pojo;

import java.util.List;

public class SchoolClass {
    private int id;
    private String name;
    private Teacher boss;
    private List<Student> students;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Teacher getBoss() {
        return boss;
    }
    public List<Student> getStudents() {
        return students;
    }
    @Override
    public String toString() {
        return "SchoolClass [id=" + id + ", name=" + name + ", boss=" + boss + ", students=" + students + "]";
    }
}
