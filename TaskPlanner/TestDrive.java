package DesignPattern.TaskPlanner;

public class TestDrive {
     
    public static void main(String []args) {
        TaskPlanner planner = new TaskPlanner();

        User user1 = planner.createUser("Niwanshu");
        User user2 = planner.createUser("Udayan");

        Task task1 = planner.createTask(TaskType.BUG, "Notification is not working");
        Task task2 = planner.createTask(TaskType.FEATURE, "Create a new feature, Rate Limiter");
        Task task3 = planner.createTask(TaskType.STORY, "Story to create a Distributed Messaging queue");

        Sprint sprint = new Sprint("Current Sprint");
        Sprint sprint2 = new Sprint("Next Sprint");

        user1.assignTask(task1);
        user1.assignTask(task2);
        user2.assignTask(task3);

        user1.showAllTasks();
        user2.showAllTasks();

        task2.updateAssignee(user2);
        task1.updateAssignee(user2);

        user1.showAllTasks();
        user2.showAllTasks();

        task1.updateStatus(Status.InDesign);
        //task1.showTaskDetails();

        sprint.addTask(task1);
        sprint.addTask(task2);
        sprint.addTask(task3);

        sprint.showAllTasks();
        sprint2.showAllTasks();
        sprint.moveTask(task3,sprint2);


        sprint.showAllTasks();
        sprint2.showAllTasks();

    }
}
