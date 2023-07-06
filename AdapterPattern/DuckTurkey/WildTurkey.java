package DesignPattern.AdapterPattern.DuckTurkey;

public class WildTurkey implements Turkey {
    
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    public void flying() {
        System.out.println("WildTurkey flying");
    }

}
