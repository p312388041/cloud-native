package com.chong.study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chong.study.entity.MicroStudent;
import com.chong.study.student.StudentApplication;
import com.chong.study.student.service.StudentService;

@SpringBootTest(classes = StudentApplication.class)
class StudyApplicationTests {
    @Autowired
    private StudentService studentService;

    @Test
    public void testAddStudent() {
        MicroStudent student = new MicroStudent("张三", 0, 0, 0);
        // microStudentRepository.save(student);
        studentService.addStudent(student);
    }
}
