package com.chong.study.entity;

public class Teacher {
    private int id;
    private String name;
    private TeacherLevel level;

    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    } 

    public TeacherLevel getLevel() {
        return level;
    }
 
    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", level=" + level + "]";
    }
}
