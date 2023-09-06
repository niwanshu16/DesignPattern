package DesignPattern.TaskPlanner;

public class Feature extends Task {
    
    public Feature(String title) {
        description = "Feature";
        this.title = title;
        this.taskID = "FEA" + count;
        currentStatus = Status.Created;
        ++count;
    }
    public String showDescription() {
        return description;
    }
}
