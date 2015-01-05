package com.control;

import com.control.ReligionName;

public class Religion {
	private ReligionName religionName;
	private int hits;
	private int misses;
	
	public Religion (ReligionName religionName) {
		this.religionName = religionName;
		this.hits = 0;
		this.misses = 0;
	}
	
	public ReligionName getReligionName () {
		return this.religionName;
	}
	
	public void updateHits () {
		this.hits++;
	}
	
	public void updateMisses () {
		this.misses++;
	}
}
