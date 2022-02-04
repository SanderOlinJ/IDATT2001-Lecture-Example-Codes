package edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects;

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString() {

        return "\nPerson:" +
                "\nName = " + name;
    }
}
