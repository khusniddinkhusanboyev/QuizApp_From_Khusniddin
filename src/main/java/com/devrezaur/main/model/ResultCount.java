package com.devrezaur.main.model;

import java.io.Serializable;
import java.util.List;
public class ResultCount implements Serializable {
  private   Integer correctAnswersCount = 0;
  private List<UnCorrectAnswer>  unCorrectAnswerList;
    public ResultCount(Integer correctAnswersCount,List<UnCorrectAnswer>  unCorrectAnswerList) {
        this.correctAnswersCount = correctAnswersCount;
        this.unCorrectAnswerList = unCorrectAnswerList;
    }

    public Integer getCorrectAnswersCount() {
        return correctAnswersCount;
    }

    public void setCorrectAnswersCount(Integer correctAnswersCount) {
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
