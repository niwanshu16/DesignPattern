package DesignPattern.CommandPattern.SortingStrategyWithCommand;

public class SortInvoker {
    
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
