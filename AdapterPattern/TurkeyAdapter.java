package DesignPattern.AdapterPattern;

//DUck is target Interface
public class TurkeyAdapter implements Duck {
    
    //Adaptee
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.flying();
    }
    
}
