package com.chong;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.chong.study.pojo.Student;


public class StudentTest {
    @Test
    public void testListToString() {
        Student student1 = new Student("aaa", 1, 1, 1);
        Student student2 = new Student("bbb", 1, 1, 1);
        List<Student> students = Arrays.asList(student1,student2);
        System.out.println(students.toString());
    }
}
