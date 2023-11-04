package DesignPattern.Splitwise;

public class SplitwiseApplication {
    
    public void addExpense(User user, double amount, String type, User[] users, Integer... percentage) {
        ExpenseStrategy expenseStrategy = getExpenseStrategy(type);

        expenseStrategy.addExpense(user,amount,users,percentage);

    }

    private ExpenseStrategy getExpenseStrategy(String type) {
        if(type.equals("EQUAL"))
            return new EqualExpenseStrategy();
        else if(type.equals("PERCENT"))
            return new PercentageExpenseStrategy();
        else
            return new ExactExpenseStrategy();
    }
}
