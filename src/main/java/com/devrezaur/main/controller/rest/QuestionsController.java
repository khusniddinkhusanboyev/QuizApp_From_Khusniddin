package com.devrezaur.main.controller.rest;


import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.mapper.MapToQuestionDTO;
import com.devrezaur.main.model.Question;
import com.devrezaur.main.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    @Autowired
    private  QuestionRepo questionRepo;

    @Autowired
    private MapToQuestionDTO mapToQuestionDTO;

    @GetMapping
    public List<Question> findAll(){
        return questionRepo.findAll();
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable Integer id){
        return questionRepo.findById(id).orElse(null);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionRepo.save(question);

    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        questionRepo.deleteById(id);
    }


}
