package com.quiz.quiz.controller;

import com.quiz.quiz.entity.Quiz;
import com.quiz.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;


    @PostMapping("/add")
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }


    @GetMapping("/all")
    public List<Quiz> getAllQuizzes() {
        return quizService.get();
    }


    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
        return quizService.get(id);
    }
}
