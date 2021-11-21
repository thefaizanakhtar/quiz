package com.acc.quiz.service;

import java.util.List;

import com.acc.quiz.model.Quiz;

import org.springframework.http.ResponseEntity;

public interface QuizService {

    public ResponseEntity<String> creatQuestion(Quiz quiz);

    public List<Quiz> getAllQuiz();

    public Quiz updateQuiz(Integer QuestionId, Quiz quiz);

    public Quiz deleteQuiz(Integer questionId);
    
}
