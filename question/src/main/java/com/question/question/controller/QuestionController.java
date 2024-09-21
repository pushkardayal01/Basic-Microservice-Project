package com.question.question.controller;

import com.question.question.Entity.Question;
import com.question.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Endpoint to create a new question
    @PostMapping("/create")
    public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
        Question createdQuestion = questionService.create(question);
        return ResponseEntity.ok(createdQuestion);
    }

    // Endpoint to get all questions
    @GetMapping("/all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        List<Question> questions = questionService.get();
        return ResponseEntity.ok(questions);
    }

    // Endpoint to get a question by ID
    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        Question question = questionService.get(id);
        return ResponseEntity.ok(question);
    }

    // Endpoint to get questions by quiz ID
    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestionsByQuizId(@PathVariable Long quizId) {
        List<Question> questions = questionService.getOnQuiz(quizId);
        return ResponseEntity.ok(questions);
    }
}
