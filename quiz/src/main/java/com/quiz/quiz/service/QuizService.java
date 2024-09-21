package com.quiz.quiz.service;

import com.quiz.quiz.entity.Quiz;

import java.util.List;

public interface QuizService {

    public Quiz add(Quiz quiz);

    public List<Quiz> get();

    public Quiz get(Long id);
}
