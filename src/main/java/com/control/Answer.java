package com.control;

public class Answer {
	private Question question;
	
	private boolean processed;
	
	public Question getQuestion() {
		return question;
	}
	
	public QuestionType getQuestionType() {
		return question.getType();
	}
	
	private Object content;
	
	public Object getContent() {
		return content;
	}
	
	public Answer(Question q, Object c) {
		content = c;
		question = q;
	}
	
	@Override
	public String toString() {
		return "[" + question.getType() + " : " + content + "]";
	}

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
}
