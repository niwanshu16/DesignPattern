package DesignPattern.Splitwise;

public abstract class ExpenseStrategy {
    
    public abstract void addExpense(User user, double amount, User[] users, Integer... percentage);
}
 