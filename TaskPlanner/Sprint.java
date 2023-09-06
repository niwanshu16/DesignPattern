package DesignPattern.TaskPlanner;

import java.util.List;
import java.util.ArrayList;

public class Sprint {
    
    List<Task> allTasks;
    String name;
    
    public Sprint(String name) {
        this.name = name;
        allTasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        allTasks.add(task);
    }

    public void showAllTasks() {
        System.out.println("----------------------------------------");
        System.out.println("Showing all Tasks for Sprint " + name);
        for(Task t: allTasks)
            t.showTaskDetails();
        System.out.println("----------------------------------------");
    }

    public void removeTask(Task task) {
        allTasks.remove(task);
    }

    public void moveTask(Task task, Sprint s) {
        this.removeTask(task);
        s.addTask(task);
    }
}
