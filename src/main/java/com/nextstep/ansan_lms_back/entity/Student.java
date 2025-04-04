package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Student")
@Table(name="Student")

public class Student {
    @Id
    private int studentId;
    private String name;
    private int status;
    private String id;
    private String pw;
    private int departmentId;
    private int professorId;
    private int classroom;
}
