package DesignPattern.AdapterPattern.DuckTurkey;

public class MallardDuck implements Duck {
    
    public void quack() {
        System.out.println("Mallard Duck quacking");
    }

    public void fly() {
        System.out.println("Mallard Duck Flying");
    }

}
