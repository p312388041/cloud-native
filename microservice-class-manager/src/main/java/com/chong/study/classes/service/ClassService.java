package com.chong.study.classes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chong.study.entity.MicroStudent;
import com.chong.study.entity.SchoolClass;
import com.chong.study.repository.MicroStudentRepository;
import com.chong.study.repository.SchoolClassRepository;


@Component
public class ClassService {
    @Autowired
    private SchoolClassRepository schoolClassRepository;

    private MicroStudentRepository microStudentRepository;

    public void saveClass(SchoolClass schoolClass) {
        List<MicroStudent> students = schoolClass.getStudents();
        for (MicroStudent microStudent : students) {
            microStudentRepository.save(microStudent);
        }
        schoolClassRepository.save(schoolClass);
    }

    public SchoolClass getClass(int id) {
        return schoolClassRepository.findById(id).get();
    }
}
