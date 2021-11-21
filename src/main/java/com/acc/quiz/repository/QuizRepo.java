package com.acc.quiz.repository;

import java.util.Optional;

import com.acc.quiz.model.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer>{
    
    Optional<Quiz> findByQuestion(String question);
}
