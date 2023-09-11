package DesignPattern.Splitwise;

public class EqualExpenseStrategy extends ExpenseStrategy {
    
    

    @Override
    public void addExpense(User user, double amount, User[] users, Integer... percentage) {
        
        double x = amount/users.length;

        for(User currentUser : users)
            user.putExpense(currentUser,x);

    }
}
