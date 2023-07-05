package DesignPattern.CommandPattern.SortingStrategyWithCommand;

//Receiver
public class SortManagerImpl {
    
    SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int arr[]) {
        sortingStrategy.sort(arr);
    }
}
