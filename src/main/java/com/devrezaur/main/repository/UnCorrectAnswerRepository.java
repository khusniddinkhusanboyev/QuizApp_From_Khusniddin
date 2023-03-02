package com.devrezaur.main.repository;

import com.devrezaur.main.model.UnCorrectAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnCorrectAnswerRepository extends JpaRepository<UnCorrectAnswer,Integer> {
    List<UnCorrectAnswer> findByResultId(Integer id);

}
