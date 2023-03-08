package com.devrezaur.main.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer quesId;
	@Column(name = "image_url")
	private String imageUrl=null;
	private String title;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private Integer ans;
	private  Integer chose;

	public Question() {
	}

	public Question(Integer quesId,
					String title,
					String optionA,
					String optionB,
					String optionC,
					String optionD,
					Integer ans) {
		this.quesId=quesId;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.ans = ans;
		this.chose = -1;

	}

	public Question(
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
		this.chose = -1;
	}

	public Question(Integer quesId,
					String imageUrl,
					String title,
					String optionA,
					String optionB,
					String optionC,
					String optionD,
					Integer chose) {
		this.quesId = quesId;
		this.imageUrl = imageUrl;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.chose = chose;
	}

/*
	public Question( String title,
					 String optionA,
					 String optionB,
					 String optionC,
					 String optionD,
					 Integer ans
					) {
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.ans = ans;
		this.chose = -1;
	}
*/


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

	public void setChose(Integer chose) {
		this.chose = chose;
	}
}
