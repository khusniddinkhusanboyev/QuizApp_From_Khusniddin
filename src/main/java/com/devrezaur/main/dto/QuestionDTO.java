package com.devrezaur.main.dto;

import org.springframework.stereotype.Component;

@Component
public class QuestionDTO {
    private Integer quesId;
    private String imageUrl=null;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private Integer ans;
    private  Integer chose=-1 ;


    public QuestionDTO() {
    }


    // for MapToQuestionDTO
    public QuestionDTO(String imageUrl,
                       String title,
                       Integer ans,
                       String optionA,
                       String optionB,
                       String optionC,
                       String optionD,
                       Integer chose) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans = ans;
        this.chose = chose;
    }

    //to update existing details
    public QuestionDTO(Integer quesId,
                       String title,
                       String optionA,
                       String optionB,
                       String optionC,
                       String optionD,
                       Integer ans) {
        this.quesId = quesId;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans = ans;
    }

    // to receive detail related to toString Method
    public QuestionDTO(Integer quesId,
                       String imageUrl,
                       String title,
                       String optionA,
                       String optionB,
                       String optionC,
                       String optionD,
                       Integer ans,
                       Integer chose) {
        this.quesId = quesId;
        this.imageUrl = imageUrl;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans = ans;
        this.chose = chose;
    }

    //to save Question Entity
    public QuestionDTO(
            String title,
            String optionA,
            String optionB,
            String optionC,
            String optionD,
            Integer ans) {
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans = ans;

    }

    public QuestionDTO(Integer quesId,
                       String imageUrl,
                       String title,
                       String optionA,
                       String optionB,
                       String optionC,
                       String optionD,
                       Integer ans) {
        this.quesId = quesId;
        this.imageUrl = imageUrl;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.ans = ans;
    }

    public Integer getQuesId() {
        return quesId;
    }

    public void setQuesId(Integer quesId) {
        this.quesId = quesId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public Integer getAns() {
        return ans;
    }

    public void setAns(Integer ans) {
        this.ans = ans;
    }

    public Integer getChose() {
        return chose;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "quesId=" + quesId +
                ", imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                ", ans=" + ans +
                ", chose=" + chose +
                '}';
    }
}
