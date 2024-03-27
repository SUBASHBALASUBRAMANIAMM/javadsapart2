package com.example.QuizApp_SpringBoot.Repository;

import com.example.QuizApp_SpringBoot.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long>{

}
