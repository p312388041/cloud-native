package com.chong.study.entity;

import java.util.List;

public class SchoolClass {
    private int id;
    private String name;
    private Teacher boss;
    private List<MicroStudent> students;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Teacher getBoss() {
        return boss;
    }
    public List<MicroStudent> getStudents() {
        return students;
    }
    @Override
    public String toString() {
        return "SchoolClass [id=" + id + ", name=" + name + ", boss=" + boss + ", students=" + students + "]";
    }
}
