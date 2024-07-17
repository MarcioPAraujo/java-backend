package list.task_list;

import java.util.ArrayList;
import java.util.List;

public class Task {
	private List <String> taskList = new ArrayList<>(); 
	
	public void addNewTask(String newTaskDescription) {
		this.taskList.add(newTaskDescription);
	}
	
	public void removeTask(String taskDescription) {
		int index = this.taskList.indexOf(taskDescription);
		this.taskList.remove(index);
	}
	
	public int totalOfTasks() {
		return this.taskList.size();
	}
	
	public List<String> allTasks(){
		return this.taskList;
	}
	
	
}
