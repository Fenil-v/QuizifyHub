package com.fenil.quizapp.Dao;

import com.fenil.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;



public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
