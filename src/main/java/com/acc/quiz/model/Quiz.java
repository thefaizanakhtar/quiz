package com.acc.quiz.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "quiz")
public class Quiz {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer q_id;
    private String question;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;
    private String crr_option;

}
