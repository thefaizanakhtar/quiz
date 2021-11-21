package com.acc.quiz.service;

import java.util.List;
import java.util.Optional;

import com.acc.quiz.model.Quiz;
import com.acc.quiz.repository.QuizRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements QuizService{

    @Autowired
    private QuizRepo quizDao;

    @Override
    public ResponseEntity<String> creatQuestion(Quiz quiz){

        Optional<Quiz> entity = quizDao.findByQuestion(quiz.getQuestion());
        if (entity.isPresent()) {
            return ResponseEntity.badRequest().body("Dublicate Data");
        }else{
            quizDao.save(quiz);
        return  ResponseEntity.ok("Created Succssesfully");
        }
    }

    @Override
    public List<Quiz> getAllQuiz(){
        List<Quiz> entity = quizDao.findAll();
        return entity;
    }

    @Override
    public Quiz updateQuiz(Integer QuestionId, Quiz quiz){
        Optional<Quiz> id = quizDao.findById(QuestionId);

        if(id.isPresent()){
            Quiz entity = quizDao.getById(QuestionId);
            entity.setQuestion(quiz.getQuestion());
            entity.setOption_a(quiz.getOption_a());
            entity.setOption_b(quiz.getOption_b());
            entity.setOption_c(quiz.getOption_c());
            entity.setOption_d(quiz.getOption_d());
            entity.setCrr_option(quiz.getCrr_option());
            return quizDao.save(entity);
        }else{
            return null;
        }
    }

    @Override
    public Quiz deleteQuiz(Integer questionId) {

        Optional<Quiz> id = quizDao.findById(questionId);
        if (id.isPresent()) {
            quizDao.deleteById(questionId);
            return null;
        }else{
            return null;
        }

    }

    }
    

