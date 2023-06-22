package DesignPattern.NotifyButton;

public class Test {
    
    public static void main(String[] args) {

        //3 users to notifyu
        User user1 = new User("Niwanshu");
        User user2 = new User("Vijay");
        User user3 = new User("Bhanuu");

        //Product for which they want to notify
        IPhoneObservable observable = new IPhoneObservable(0);
        WashingMachineObservable observable2 = new WashingMachineObservable(0);
        EmailObserver emailObserver = new EmailObserver(observable, user1);
        EmailObserver emailObserver2 = new EmailObserver(observable, user2);
        PhoneObserver phoneObserver = new PhoneObserver(observable, user1);
        PhoneObserver phoneObserver2 = new PhoneObserver(observable, user2);
        PhoneObserver phoneObserver3 = new PhoneObserver(observable, user3);
        phoneObserver3 = new PhoneObserver(observable2, user3);
        emailObserver2 = new EmailObserver(observable2, user1);

        observable.setItemCount(10);
        observable2.setItemCount(10 );

    }
}
