package com.control;

public class QuestionCounter {
	private int value = 0;
	
	public void increment() {
		++value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void reset() {
		value = 0;
	}
}
