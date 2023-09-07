package DesignPattern.TaskPlanner;

public class TaskPlanner {
    
    public TaskPlannerManager taskPlannerManager;

    public TaskPlanner() {
        taskPlannerManager = TaskPlannerManager.uniqueInstance();
    }

    public Task createTask(TaskType type, String title) {
        return taskPlannerManager.createTask(type, title);
    }

    public User createUser(String userName) {
        return taskPlannerManager.createUser(userName);
    }

    public void showAllTasks() {
        taskPlannerManager.showAllTasks();
    }
}
