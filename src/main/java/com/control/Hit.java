package com.control;

import java.util.ArrayList;
import java.util.List;

import com.control.*;

public class Hit {
	private boolean type;
	public boolean getType() { return type; }
	
	private ReligionName religionName;
	public ReligionName getReligionName() { return religionName; }
	
	private Answer cause;
	public Answer getCause() { return cause; }
	
	public Hit(ReligionName religionName, boolean type, Answer cause) {
		this.religionName = religionName;
		this.type = type;
		this.cause = cause;
	}
	
}
