package NotifyMeObserver;

public class TestDecorator {

    public static void main(String []args) {        
        Products notifier = new IPhone();
        User user = new User(notifier, new InformViaEmail());
        User1 user1 = new User1(notifier, new InformViaPhone());
        notifier.stockAdded(10);

        
        Products notifier1 = new Mixer();
        user = new User(notifier1, new InformViaEmail());
        user1 = new User1(notifier1, new InformViaPhone());
        notifier1.stockAdded(100);

        notifier1 = new OnePlus();
        user = new User(notifier1, new InformViaPhone());
        user1 = new User1(notifier1, new InformViaPhone());
        notifier1.stockAdded(1);
    }
}
