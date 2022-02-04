package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Methods;

public class Manager extends Employee{
    private String groupResponsible;

    protected Manager(String socialSecurityNumber, String firstName, String middleName,
                      String surName, double salary, String group){
        super(socialSecurityNumber, firstName, middleName, surName, salary);
        this.groupResponsible = group;
    }

    public String getGroupResponsible() {
        return groupResponsible;
    }

    public void setGroupResponsible(String groupResponsible) {
        this.groupResponsible = groupResponsible;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "groupResponsible='" + groupResponsible + '\'' +
                super.toString() + '}';
    }
}
