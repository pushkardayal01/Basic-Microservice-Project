package com.question.question.service;

import com.question.question.Entity.Question;

import java.util.List;

public interface QuestionService {


    public Question create(Question question);

    public List<Question> get();


    public Question get(Long id);


    public List<Question> getOnQuiz(Long quizId);
}
