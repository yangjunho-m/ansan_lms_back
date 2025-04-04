package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Department")
@Table(name="Department")

public class Department {
    @Id
    private int departmentId;
    private String name;
}
