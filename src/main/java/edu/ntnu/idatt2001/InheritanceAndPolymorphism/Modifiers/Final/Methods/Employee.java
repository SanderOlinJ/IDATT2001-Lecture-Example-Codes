package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Methods;

public class Employee extends Person{
    private double salary;

    protected Employee(String socialSecurityNumber, String firstName, String middleName,
                       String surName, double salary){
        super(socialSecurityNumber, firstName, middleName, surName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    //THIS METHOD WILL NOW BE LOCKED FOR OVERRIDE FURTHER DOWN THE EXTEND-PATH
    //This means that for example Manager won't be able to change his own salary for himself
    public final void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                super.toString() + '}';
    }
}
