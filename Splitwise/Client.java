package DesignPattern.Splitwise;

public class Client {
    
    public static void main(String []args) {

        SplitwiseApplication application = new SplitwiseApplication();
        User user1 = new User("User1");
        User user2 = new User("User2"); 
        User user3 = new User("User3");

        application.addExpense(user1,5000,"PERCENT",new User[]{user1,user2,user3}, 20,40,40);
        application.addExpense(user2, 2000, "EQUAL", new User[]{user1,user2,user3});
        application.addExpense(user3,10000,"EXACT",new User[]{user1,user2},7000,3000);
        application.addExpense(user1,600,"PERCENT", new User[]{user1,user2,user3}, 30,50,20);
        application.addExpense(user2,3250,"EXACT",new User[]{user1,user3},2000,1250);


        user1.expenses(); 
        user2.expenses();
        user3.expenses(); 
    }
}
