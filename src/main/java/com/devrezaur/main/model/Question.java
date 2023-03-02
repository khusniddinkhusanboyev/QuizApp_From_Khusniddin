package com.devrezaur.main.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quesId;
	@Column(name = "image_url")
	private String imageUrl=null;
	private String title;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private int ans;
	private int chose;



	public Question(int quesId, String imageUrl, String title, String optionA, String optionB, String optionC, String optionD, int ans, int chose) {
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

	public Question() {
		super();
	}

	public int getQuesId() {
		return quesId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public void setQuesId(int quesId) {
		this.quesId = quesId;
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

	public String getOptionD() {
		return optionD;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getChose() {
		return chose;
	}

	public void setChose(int choosed) {
		this.chose = choosed;
	}

	@Override
	public String toString() {
		return "Question{" +
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
