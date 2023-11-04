package DesignPattern.Splitwise;

import java.util.HashMap;
import java.util.Map;

public class User {
    
    private String name;
    double amount = 0;
    HashMap<User,Double> expenseMapping;

    public User(String name) {
        this.name = name;
        expenseMapping = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Double getExpense(User user) {
        if(expenseMapping.containsKey(user)) 
            return expenseMapping.get(user);
        return 0.0;
    }

    public void putExpense(User user, double amount) {
        double value1 = user.getExpense(this);
        double value2 = this.getExpense(user);
        
        if(value1 > value2 + amount) {
            this.removeKey(user);
            user.updateExpense(this,value1 - amount - value2);
        }
        else if(this == user) {
            user.updateExpense(user, amount+value1);
        }
        else {
            user.removeKey(this);
            this.updateExpense(user, amount + value2 - value1);
        }
    }

    public void expenses() {
        for(Map.Entry<User,Double> map : expenseMapping.entrySet()) {
            User user = map.getKey();
            Double value = map.getValue();

            if(user != this) {
                System.out.println(user.getName() + " owes " + this.getName() + " : " + value);
            }
            else   
                System.out.println(user.getName() + " owes himself " + " : " + value);
        }
    }

    private void updateExpense(User user, double amount) {
        if(amount == 0.0) 
            expenseMapping.remove(user);
        else {
            amount = Math.round(amount*100.0)/100.0;
            expenseMapping.put(user,amount);
        }
    }

    private void removeKey(User user) {
        if(expenseMapping.containsKey(user))
            expenseMapping.remove(user);
    }
}
