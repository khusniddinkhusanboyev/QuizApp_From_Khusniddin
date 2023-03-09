package com.devrezaur.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.devrezaur.main.repository.QuestionRepo;
import com.devrezaur.main.repository.ResultRepo;

@Service
public class QuizService {
    @Autowired
    private QuestionForm qForm;
    @Autowired
    private QuestionRepo qRepo;
    @Autowired
    private ResultRepo rRepo;

    /*@Autowired
    Question question;
*/
    @Autowired
    Result result;


    public QuestionForm getQuestions() {
        List<Question> allQues = qRepo.findAll();
        List<Question> qList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int rand = random.nextInt(allQues.size());
            qList.add(allQues.get(rand));
            allQues.remove(rand);
        }
        qForm.setQuestions(qList);
        return qForm;
    }

    public ResultCount getResult(QuestionForm qForm) {
        int correct = 0;
        List<UnCorrectAnswer> list = new ArrayList<>();
        for (Question q : qForm.getQuestions()) {
            if (q.getAns() == q.getChose()) {
                correct++;
            } else {
                list.add(new UnCorrectAnswer(q.getTitle(), q.getImageUrl(), getOptionString(q), 0, getAnswerString(q)));
            }
        }
        return new ResultCount(correct, list);
    }

    public Integer saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setUsername(result.getUsername());
        saveResult.setTotalCorrect(result.getTotalCorrect());
        var savedEntity = rRepo.save(saveResult);

        return savedEntity.getId();
    }

    public String getOptionString(Question question) {
        return switch (question.getAns()) {
            case 1 -> question.getOptionA();
            case 2 -> question.getOptionB();
            case 3 -> question.getOptionC();
            case 4 -> question.getOptionD();
            default -> "given not answer";
        };

    }

    public String getAnswerString(Question question) {
        System.err.println(question);
        return switch (question.getChose()) {
            case 1 -> question.getOptionA();
            case 2 -> question.getOptionB();
            case 3 -> question.getOptionC();
            case 4 -> question.getOptionD();
            default -> "given not answer";
        };

    }


    public List<Result> getTopScore() {
        List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));


        return sList;
    }









}
