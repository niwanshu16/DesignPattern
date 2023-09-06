package DesignPattern.TaskPlanner;

public class Bug extends Task {

    public Bug(String title) {
        description = "Bug";
        this.title = title;
        this.taskID = "BUG" + count;
        currentStatus = Status.Created;
        ++count;
    }
    public String showDescription() {
        return description;
    }
}

