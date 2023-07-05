package DesignPattern.CommandPattern.SortingStrategyWithCommand;

//Client
public class TestSortingCommand {
    
    public static void main(String []args) {

        //Receiver
        SortManagerImpl sortManager = new SortManagerImpl();
        int arr[] = {5,3,2,2};
        
        SortingStrategy bubbSortingStrategy = new BubbleSortStrategy();
        

        SortingStrategy quickSortingStrategy = new QuickSortStrategy();
        sortManager.setSortingStrategy(quickSortingStrategy);
        
        //Concreete Command
        Command sortCommand = new SortCommand(sortManager,arr);

        //Invoker
        SortInvoker sortInvoker = new SortInvoker();
        sortInvoker.setCommand(sortCommand);
        sortInvoker.executeCommand();

        //The object SortInvoker which call the functionality and the object SortManager which executes the 
        // function are different and hence decopuled.
        sortManager.setSortingStrategy(bubbSortingStrategy);
        sortCommand = new SortCommand(sortManager,arr);
        sortInvoker.setCommand(sortCommand);
        sortInvoker.executeCommand();

    }
}
