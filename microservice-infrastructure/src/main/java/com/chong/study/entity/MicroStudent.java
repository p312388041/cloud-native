package com.chong.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MicroStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column
    private final String name;
    @Column
    private final float chinese;
    @Column
    private final float english;
    @Column
    private final float math;
    @Column
    private float total = 0;

    public MicroStudent(long id, String name, float chinese, float english, float math) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public MicroStudent(int id, String name, float chinese, float english, float math, float  total) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        this.total = total;
    }

    public MicroStudent(String name, float chinese, float english, float math) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getChinese() {
        return chinese;
    }

    public float getEnglish() {
        return english;
    }

    public float getMath() {
        return math;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "MicroStudent [id=" + id + ", name=" + name + ", chinese=" + chinese + ", english=" + english + ", math="
                + math + ", total=" + total + "]";
    }
}
