package list.task_list;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> tasks = new ArrayList<>();
		Task myTasks = new Task();
		myTasks.addNewTask("watch something");
		myTasks.addNewTask("play a game");
		
		myTasks.removeTask("play a game");
		
		
		System.out.println(myTasks.totalOfTasks());
		tasks = myTasks.allTasks();
		System.out.println(tasks.get(0));
	}

}
