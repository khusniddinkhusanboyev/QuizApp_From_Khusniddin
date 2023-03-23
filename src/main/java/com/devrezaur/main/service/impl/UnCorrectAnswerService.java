package com.devrezaur.main.service.impl;

import com.devrezaur.main.model.UnCorrectAnswer;
import com.devrezaur.main.repository.UnCorrectAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UnCorrectAnswerService {

    @Autowired
    private UnCorrectAnswerRepository repository;

    public void saveAll(List<UnCorrectAnswer> list) {
        repository.saveAll(list);
    }

    public List<UnCorrectAnswer> getUnCorrectAnswers(Integer id) {
        return repository.findByResultId(id);
    }


}
