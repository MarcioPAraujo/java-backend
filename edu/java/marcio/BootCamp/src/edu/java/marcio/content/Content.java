package edu.java.marcio.content;

public abstract class Content {
	protected String title;
	protected String description;
	protected static double BASE_XP = 10;
	public abstract double calcXP();
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
