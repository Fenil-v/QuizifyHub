package com.fenil.quizapp.service;

import com.fenil.quizapp.Dao.QuestionDao;
import com.fenil.quizapp.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question>getAllQuestions(){
        return questionDao.findAll();
    }

    public List<Question>getAllQuestionsByCategory(String category){
        return questionDao.findByCategory(category);
    }
}
