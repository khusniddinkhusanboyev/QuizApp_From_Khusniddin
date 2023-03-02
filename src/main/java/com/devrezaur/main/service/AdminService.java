package com.devrezaur.main.service;

import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.model.Question;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {
    Question save(Question question);
    List<Question> list();
    void delete(Integer id);

    QuestionDTO findById(Integer id);
}
