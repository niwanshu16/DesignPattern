package DesignPattern.TaskPlanner;

import java.util.List;
import java.util.ArrayList;

public class TaskPlannerManager {
    
    List<Task> allTasks;
    List<User> allUsers;
    List<Sprint> allSprints;

    static TaskPlannerManager taskPlannerManager = null;

    private TaskPlannerManager() {
        allTasks = new ArrayList<>();
        allUsers = new ArrayList<>();
        allSprints = new ArrayList<>();
    }

    public static TaskPlannerManager uniqueInstance() {
        if(taskPlannerManager == null) 
            taskPlannerManager = new TaskPlannerManager();
        return taskPlannerManager;
    }
    public Task createTask(TaskType type, String title) {
        Task newTask = getTask(type,title);
        allTasks.add(newTask);
        return newTask;
    }

    public Task getTask(TaskType type, String title) {
        if(type.equals(TaskType.BUG))
            return new Bug(title);
        else if(type.equals(TaskType.FEATURE))
            return new Feature(title);
        return new Story(title);
    }

    public void showAllTasks() {
        System.out.println("Showing Task Details ");

        for(Task t: allTasks) 
            t.showTaskDetails();

        System.out.println("END");
    }

    public User createUser(String userName) {
        User user = new User(userName);
        allUsers.add(user);
        return user;
    }

    public Sprint createSprint(String name) {
        Sprint newSprint = new Sprint(name);
        allSprints.add(newSprint);
        return newSprint;
    }
}
