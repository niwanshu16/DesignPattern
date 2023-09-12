package DesignPattern.RateLimiter;

public class Client {
    
    public static void main(String []args) {
        User user = new User("Niwanshu");
        RateLimiter rateLimiter = new RateLimiter();
        try {
            for(int i=0;i<10;i++) {
                System.out.println(rateLimiter.grantAccess(user));
                Thread.sleep(200);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
