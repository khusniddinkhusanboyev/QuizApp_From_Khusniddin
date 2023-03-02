package com.devrezaur.main.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

public class ResultCount implements Serializable {
  private   int correctAnswersCount = 0;
  private List<UnCorrectAnswer>  unCorrectAnswerList;
    public ResultCount(int correctAnswersCount,List<UnCorrectAnswer>  unCorrectAnswerList) {
        this.correctAnswersCount = correctAnswersCount;
        this.unCorrectAnswerList = unCorrectAnswerList;
    }

    public int getCorrectAnswersCount() {
        return correctAnswersCount;
    }

    public void setCorrectAnswersCount(int correctAnswersCount) {
        this.correctAnswersCount = correctAnswersCount;
    }
    public List<UnCorrectAnswer>  getUnCorrectAnswerList() {
        return unCorrectAnswerList;
    }

    @Override
    public String toString() {
        return "ResultCount{" +
                "correctAnswersCount=" + correctAnswersCount +
                ", unCorrectAnswerList=" + unCorrectAnswerList +
                '}';
    }
}
