package DesignPattern.TaskPlanner;

public class Story extends Task {
    
    public Story(String title) {
        description = "Story";
        this.title = title;
        this.taskID = "STO" + count;
        currentStatus = Status.Created;
        ++count;
    }

    public String showDescription() {
        return description;
    }

}

