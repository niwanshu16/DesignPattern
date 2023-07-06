package DesignPattern.AdapterPattern.DuckTurkey;

//Adapter
// Turkey is target interface
public class DuckAdapter implements Turkey {
    //Adaptee
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void flying() {
        duck.fly();
    }
}
