package DesignPattern.SingletonPattern;

public class Singleton {
    
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
            System.out.println("Instance Created");
        }
        return instance;
    }
}
