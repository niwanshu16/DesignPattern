package DesignPattern.CommandPattern.SortingStrategyWithCommand;

public class TestSortingCommand {
    
    public static void main(String []args) {

        SortManagerImpl sortManager = new SortManagerImpl();
        int arr[] = {5,3,2,2};
        
        SortingStrategy bubbSortingStrategy = new BubbleSortStrategy();
        

        SortingStrategy quickSortingStrategy = new QuickSortStrategy();
        sortManager.setSortingStrategy(quickSortingStrategy);
        
        SortCommand sortCommand = new SortCommand(sortManager,arr);

        SortInvoker sortInvoker = new SortInvoker();
        sortInvoker.setCommand(sortCommand);
        sortInvoker.executeCommand();

        sortManager.setSortingStrategy(bubbSortingStrategy);
        sortCommand = new SortCommand(sortManager,arr);
        sortInvoker.setCommand(sortCommand);
        sortInvoker.executeCommand();

    }
}
