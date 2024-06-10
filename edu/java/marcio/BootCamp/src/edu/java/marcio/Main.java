package edu.java.marcio;

import edu.java.marcio.content.Content;
import edu.java.marcio.content.Course;
import edu.java.marcio.content.Mentorship;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("john");
		
		Content content = null;
		Course linuxCommands = new Course();
		linuxCommands.setWorkload(20);
		linuxCommands.setTitle("basic terminal");
		linuxCommands.setDescription("know more than simplily type the command but how it works under the table");
		
		Mentorship mentor = new Mentorship();
		mentor.setTitle("winner mindset");
		mentor.setDescription("learn with the high performace atletes how to develp a winer mindset");
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setName("linux system admin");
		bootcamp.setDescription("from the scratch to advanced");
		content = linuxCommands;
		bootcamp.getContents().add(content);
		content = mentor;
		bootcamp.getContents().add(content);
		
		student.subscribeInBootcamp(bootcamp);
		student.makeProgress();
		System.out.println(student.getSubscribedContents());
		
		
	}

}
