package com.control;

public class Message {

	private MessageType type;
	
	public MessageType getType() {
		return type;
	}

	public Message(MessageType type) {
		this.type = type;
	}
	
	public enum MessageType {
		INITIAL_PHASE, // Jestesmy w fazie poczatkowej
		INITIAL_PHASE_QUESTION, // prosba o kolejne pytanie z puli pytan poczatkowych
		SECOND_PHASE,
		INCREMENT_COUNTER,
		SECOND_PHASE_QUESTION,
		EVALUATE_BEST,
		CHOOSE_TOP_RELIGION,
		RETRACT_TOP_RELIGION
	}
}
