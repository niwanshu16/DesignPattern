package DesignPattern.TaskPlanner;

public abstract class Task {
    
    String description;
    String title;
    String taskID;
    User assignee;
    Status currentStatus;
    static int count = 1;

    public abstract String showDescription();

    public void updateStatus(Status status) {
        this.currentStatus = status;
    }

    public Status getStatus() {
        return currentStatus;
    }

    public void updateAssignee(User user) {
        assignee.removeTask(this);
        assignee = user;
        user.assignTask(this);
    }

    public void showTaskDetails() {
        System.out.println("----------------------------------------");
        System.out.println(description + " " + taskID );
        System.out.println("Title " + title);
        if(assignee != null)
            assignee.showUser();
        System.out.println(currentStatus);
        System.out.println("----------------------------------------");
    }

    public void setAssignee(User user) {
        this.assignee = user;
    }
}
