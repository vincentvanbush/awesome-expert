package com.control;

import com.control.ReligionName;

public class Religion implements Comparable {
	private ReligionName religionName;
	private int hits;
	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getMisses() {
		return misses;
	}

	public void setMisses(int misses) {
		this.misses = misses;
	}
	
	public float getRatio() {
		if (hits == 0) return 0;
		if (misses == 0) return Float.POSITIVE_INFINITY;
		return (float)(hits) / (float)(misses);
	}

	private int misses;
	
	public Religion (ReligionName religionName) {
		this.religionName = religionName;
		this.hits = 0;
		this.misses = 0;
	}
	
	public ReligionName getReligionName () {
		return this.religionName;
	}
	
	public void update (boolean type) {
		if (type) this.hits++;
		else this.misses++;
	}

	public int compareTo(Object o) {
		return -1 * Float.compare(getRatio(), ((Religion)(o)).getRatio());
	}
	
}
