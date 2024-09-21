package com.question.question.service;

import com.question.question.Entity.Question;
import com.question.question.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get(){
        return questionRepository.findAll();
    }

    @Override
    public Question get(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question not found") )
    }

    @Override
    public List<Question> getOnQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
