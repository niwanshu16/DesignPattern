package DesignPattern.CabRentalApp;

public class User {
    
    String name;
    Character sex;
    int age;

    public User(String name, Character sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void showUser() {
        System.out.println("Name: " + name + " Gender " + sex + " Age " + age);
    }
}
