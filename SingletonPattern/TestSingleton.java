package DesignPattern.SingletonPattern;

public class TestSingleton {
    
    public static void main(String []args) {
        Singleton instance = Singleton.getInstance();
        instance = Singleton.getInstance();

        SingletonSynchronised instance1 = SingletonSynchronised.getInstance();
        instance1 = SingletonSynchronised.getInstance();

        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        instance2.doSomething();
    }
}
