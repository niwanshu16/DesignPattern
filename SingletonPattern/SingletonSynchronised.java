package DesignPattern.SingletonPattern;

public class SingletonSynchronised {
    
    private static volatile SingletonSynchronised instance;
    private SingletonSynchronised() {}

    public static SingletonSynchronised getInstance() {
        
        if(instance == null) {
            synchronized(SingletonSynchronised.class) {
                instance = new SingletonSynchronised();
                System.out.println("Instance created synchronised");
            }
        }
        return instance;
    }

}
