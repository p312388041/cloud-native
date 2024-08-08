package com.chong.study.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chong.study.entity.MicroStudent;
import com.chong.study.repository.MicroStudentRepository;

@Component
public class StudentService {

    @Autowired
    private MicroStudentRepository studentRepository;

    public void addStudent(MicroStudent student) {
        studentRepository.save(student);
    } 

    public MicroStudent findMicroStudent(long id) {
        return studentRepository.findById(id).get();
    }
}
