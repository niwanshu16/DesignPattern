package DesignPattern.TaskPlanner;

import java.util.List;
import java.util.ArrayList;

public class User {
    
    String userName;
    List<Task> tasks;

    public User(String userName) {
        this.userName = userName;
        tasks = new ArrayList<>();
    }

    public void assignTask(Task task) {
        tasks.add(task);
        task.setAssignee(this);
    }

    public void showAllTasks() {
        System.out.println("----------------------------------------");
        System.out.println("SHOWING ALL THE TASKS FOR " + userName);
        for(Task task : tasks)
            task.showTaskDetails();
        System.out.println("----------------------------------------");
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void showUser() {
        System.out.println(userName);
    }
}
