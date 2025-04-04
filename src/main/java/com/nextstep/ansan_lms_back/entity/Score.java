package com.nextstep.ansan_lms_back.entity;

import jakarta.persistence.*;

@Entity(name="Score")
@Table(name="Score")

public class Score {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timetableId;
    private String grade;
    private int scoreId;
}
