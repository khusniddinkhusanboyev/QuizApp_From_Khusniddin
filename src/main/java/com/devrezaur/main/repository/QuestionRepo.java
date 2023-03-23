package com.devrezaur.main.repository;

import com.devrezaur.main.dto.QuestionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devrezaur.main.model.Question;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {


}