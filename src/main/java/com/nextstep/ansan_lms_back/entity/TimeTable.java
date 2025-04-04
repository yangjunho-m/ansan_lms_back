package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Timetable")
@Table(name="Timetable")

public class TimeTable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int year;
    private boolean term;
    private int timetableId;
    private int studentId;
    private int lectureId;
}
