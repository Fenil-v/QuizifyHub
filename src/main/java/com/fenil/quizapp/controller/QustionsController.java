package com.fenil.quizapp.controller;

import com.fenil.quizapp.Question;
import com.fenil.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QustionsController {

    @Autowired
    QuestionService questionService;

    //get all questions
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    //get questions by category
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getAllQuestionsByCategory(@PathVariable String category){
        return questionService.getAllQuestionsByCategory(category);
    }

    //add new questions
    @PostMapping("add")
    public ResponseEntity<String> addNewQuestions(@RequestBody Question question){
        return questionService.addQuestion(question);
    }


}
