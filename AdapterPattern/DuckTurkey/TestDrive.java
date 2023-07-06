package DesignPattern.AdapterPattern.DuckTurkey;

import DesignPattern.TurkeyAdapter;

public class TestDrive {
    
    public static void main(String []args) {

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        DuckAdapter duckAdapter = new DuckAdapter(duck);
        testDuck(duck);
        testTurkey(turkey);
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(turkeyAdapter);
        testTurkey(duckAdapter);
    }

    public static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.flying();
    }

}
