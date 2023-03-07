package com.devrezaur.main.dto;

public class QuestionDTO {
    private Integer quesId;
    private String imageUrl=null;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private Integer ans;
    private  Integer chose ;

    public QuestionDTO(String imageUrl, String title, Integer ans, String optionA, String optionB, String optionC, String optionD, Integer chose) {
    }

    public QuestionDTO() {
    }

    public QuestionDTO(
                       String imageUrl,
                       String title,
                       String optionA,
                       String optionB,
                       String optionC,
                       String optionD,
                       Integer ans) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.ans = ans;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.chose = -1;
    }

    public QuestionDTO(
            Integer quesId,
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