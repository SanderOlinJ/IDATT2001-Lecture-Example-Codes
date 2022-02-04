package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Instance;

import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Person;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name){
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary + ", " +
                super.toString() + '}';
    }
}
