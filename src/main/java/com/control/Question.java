package com.control;

import com.control.QuestionType;
import com.control.ReligionName;

public class Question {
	private QuestionType type;
	private Object[] answers;
	private ReligionName[] religions;
	private Boolean active;
	private Object selectedAnswer;
	
	public Question (QuestionType type, Object answers[], ReligionName religions[] ) {
		this.type = type;
		this.answers = answers;
		this.religions = religions;
		this.active = false;
	}
	
	public QuestionType getType () {
		return this.type;
	}
	
	public Object[] getAnswers () {
		return this.answers;
	}
	
	public ReligionName[] getReligions () {
		return this.religions;
	}
	
	public Boolean getActive () {
		return this.active;
	}
	
	public Object getSelectedAnswer () {
		return this.selectedAnswer;
	}
	
	public void activate () {
		this.active = true;
	}
}
