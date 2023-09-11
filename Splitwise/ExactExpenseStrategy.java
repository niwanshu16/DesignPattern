package DesignPattern.Splitwise;

public class ExactExpenseStrategy extends ExpenseStrategy {

    @Override
    public void addExpense(User user, double amount, User[] users, Integer... exactAmount) {
        int index = 0;

        for(Integer exact : exactAmount) {
            User currentUser = users[index++];
            user.putExpense(currentUser, exact);
        }
    }
    
    
}
