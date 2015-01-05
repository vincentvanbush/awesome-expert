package com.control;

import com.control.QuestionType;
import com.control.ReligionName;

public class Question {
	private QuestionType question;
	private Object[] answers;
	private ReligionName[] religions;
	private Boolean asked;
	private int selectedAnswer;
	
	public Question (QuestionType question, Object answers[], ReligionName religions[] ) {
		this.question = question;
		this.answers = answers;
		this.religions = religions;
		this.asked = false;
	}
	
	public QuestionType getQuestion () {
		return this.question;
	}
	
	public Object[] getAnswers () {
		return this.answers;
	}
	
	public ReligionName[] getReligions () {
		return this.religions;
	}
	
	public Boolean getAsked () {
		return this.asked;
	}
	
	public int getSelectedAnswer () {
		return this.selectedAnswer;
	}
}
