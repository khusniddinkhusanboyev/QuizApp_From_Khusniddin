package com.devrezaur.main.model;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class QuestionForm {

	private String user;
	private List<Question> questions;
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "QuestionForm{" +
				"user='" + user + '\'' +
				", questions=" + questions +
				'}';
	}
}
