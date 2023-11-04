package DesignPattern.Splitwise;

public class PercentageExpenseStrategy extends ExpenseStrategy {

    @Override
    public void addExpense(User user, double amount, User[] users, Integer... percentage) {
        
        int index = 0;
        for(int percent : percentage) {
            User currentUser = users[index];
            double x = percent * amount/100;
            user.putExpense(currentUser, x);
            index++;
        }
    }
}
