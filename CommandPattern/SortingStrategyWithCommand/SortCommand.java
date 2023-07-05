package DesignPattern.CommandPattern.SortingStrategyWithCommand;

//Concrete Command
public class SortCommand implements Command {
    
    SortManagerImpl sortManager;
    int arr[];

    public SortCommand(SortManagerImpl sortManager, int arr[]) {
        this.sortManager = sortManager;
        this.arr = arr;
    }

    public void execute() {
        sortManager.performSort(arr);
    }
}
