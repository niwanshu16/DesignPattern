package DesignPattern.TemplatePattern.ArraySort;

public class Duck implements Comparable<Duck>{
    
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    public int compareTo(Duck other) {
        System.out.println("COMPARE");
        if(this.weight < other.weight)
            return 1;
        else if(this.weight == other.weight)
            return 0;
        else
            return -1;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

}
