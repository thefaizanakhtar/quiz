package com.acc.quiz.repository;

import com.acc.quiz.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer>{
    
}
