package edu.java.marcio.content;

import java.time.LocalDate;

public class Mentorship extends Content {
	
	private final LocalDate start = LocalDate.now();
	private final LocalDate end = start.plusDays(60);
	@Override
	public double calcXP() {
		// TODO Auto-generated method stub
		return BASE_XP + 10;
	}
	@Override
	public String toString() {
		return "Mentorship [start=" + start + ", end=" + end + ", title=" + title + ", description=" + description
				+ "]";
	}
	
	
	

}
