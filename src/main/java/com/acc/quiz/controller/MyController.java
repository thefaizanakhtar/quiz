package com.acc.quiz.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



import com.acc.quiz.model.Quiz;
import com.acc.quiz.service.QuizService;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping(value = "/quiz")
public class MyController {
    
    @Autowired
    private QuizService service;


    @GetMapping(value="/home")
    public String home() {
        return "Welcome to Quiz Managment System";
    }
    
    @PostMapping(value="/create")
    public Quiz creatQuestion(@RequestBody Quiz quiz) {
        return this.service.creatQuestion(quiz);
    }

    @GetMapping(value = "/all")
    public List<Quiz> getAllQuiz(){
        return this.service.getAllQuiz();
    }

    @PutMapping(value = "/update")
    public Quiz updateQuiz(@PathVariable Integer QuestionId, @RequestBody Quiz quiz){

        return this.service.updateQuiz(QuestionId,quiz);
    }
    
    @DeleteMapping(value = "/{questionId}")
    public Quiz deleteQuiz(@PathVariable Integer questionId){
        return this.service.deleteQuiz(questionId);
    }
}
