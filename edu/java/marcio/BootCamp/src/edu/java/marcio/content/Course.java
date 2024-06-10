package edu.java.marcio.content;

public class Course extends Content {
	
	private int workload;
	
	@Override
	public double calcXP() {
		// TODO Auto-generated method stub
		return workload * BASE_XP;
	}

	public int getWorkload() {
		return workload;
	}

	public void setWorkload(int workload) {
		this.workload = workload;
	}

	
	@Override
	public String toString() {
		return "Course [workload=" + workload + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	

}
