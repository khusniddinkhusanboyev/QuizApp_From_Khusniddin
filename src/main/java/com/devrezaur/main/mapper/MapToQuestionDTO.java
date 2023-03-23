package com.devrezaur.main.mapper;

import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.model.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MapToQuestionDTO {

    public QuestionDTO mapQuestionDTO(Question question){
        return new QuestionDTO(
                question.getQuesId() ,
                question.getImageUrl() ,
                question.getTitle(),
                question.getOptionA(),
                question.getOptionB(),
                question.getOptionC(),
                question.getOptionD(),
                question.getAns());
    }

    public List<QuestionDTO>  list(List<Question> listques){
        List<QuestionDTO> list=new ArrayList<>();
        for (Question question: listques){
            list.add(new QuestionDTO(
                    question.getImageUrl(),
                    question.getTitle(),
                    question.getAns(),
                    question.getOptionA(),
                    question.getOptionB(),
                    question.getOptionC(),
                    question.getOptionD(),
                    question.getChose()));
        }
        return list;
    }
}
