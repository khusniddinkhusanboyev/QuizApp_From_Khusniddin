package com.devrezaur.main.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component

@Entity
@Table(name = "uncorrect")
public class UnCorrectAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "correct_answer")
    private String correctAnswer;
    @Column(name = "result_id")
    private Integer resultId;
    @Column(name ="uncorrect")
    private String uncorrect;

    public UnCorrectAnswer(String title, String imageUrl, String correctAnswer, Integer resultId, String uncorrect) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.correctAnswer = correctAnswer;
        this.resultId = resultId;
        this.uncorrect = uncorrect;
    }

    public UnCorrectAnswer(Integer id, String title, String imageUrl, String correctAnswer, Integer resultId, String uncorrect) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.correctAnswer = correctAnswer;
        this.resultId = resultId;
        this.uncorrect = uncorrect;
    }

    public Integer getResultId() {
        return resultId;
    }

    public UnCorrectAnswer() {
    }

    public String
    getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "UnCorrectAnswer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", correctAnswer=" + correctAnswer +
                ", resultId=" + resultId +
                '}';
    }
}
