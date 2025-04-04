package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Lecture")
@Table(name="Lecture")

public class Lecture {
    @Id
    private int lectureId;
    private String Title;
    private String startTime;
    private String endTime;
    private int professorId;
    private int point;
    private int classroom;
    private String room;
    private boolean major;
}
