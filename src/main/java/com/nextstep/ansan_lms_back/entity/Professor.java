package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Professor")
@Table(name="Professor")

public class Professor {
    @Id
    private int departmentId;
    private int professorId;
    private String name;
    private String id;
    private String pw;
}
