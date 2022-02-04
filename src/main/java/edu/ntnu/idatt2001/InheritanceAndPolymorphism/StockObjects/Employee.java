package edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects;

public class Employee extends Person{
    private double salary;

    public Employee(String name){
        super(name);
    }

    public Employee(String name, double salary){
        super(name);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nEmployee:" +
                "\nSalary = " + salary +
                "\n" + super.toString();
    }
}
