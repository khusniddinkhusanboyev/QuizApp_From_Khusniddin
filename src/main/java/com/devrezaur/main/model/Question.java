package com.devrezaur.main.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
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

	public Question(String imageUrl,
					String title,
					String optionA,
					String optionB,
					String optionC,
					String optionD,
					Integer ans
					) {
		this.imageUrl = imageUrl;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.ans = ans;
		this.chose = -1;
	}

	public Integer getQuesId() {
		return quesId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getTitle() {
		return title;
	}

	public String getOptionA() {
		return optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public Integer getAns() {
		return ans;
	}

	public Integer getChose() {
		return chose;
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
