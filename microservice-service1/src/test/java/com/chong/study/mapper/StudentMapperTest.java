package com.chong.study.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chong.study.microservice.Microservice;
import com.chong.study.pojo.Student;
import com.chong.study.service.StudentService;

@SpringBootTest(classes = Microservice.class)
public class StudentMapperTest {

    @Autowired
    private StudentService studentService;

    @Test
    void intsertTest() {
        Student student = new Student("zhang san", 11, 12, 13);
        studentService.insert(student);
    }
}
