package DesignPattern.SingletonPattern;

public enum SingletonEnum {
    
    INSTANCE;

    public void doSomething() {
        System.out.println("Instance created with enum");
    }
}
