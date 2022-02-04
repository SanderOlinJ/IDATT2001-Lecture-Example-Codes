package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Methods;

public class Person {
    private final String socialSecurityNumber;
    private String firstName;
    private final String middleName;
    private String surName;

    protected Person(String socialSecurityNumber, String firstName, String middleName, String surName){
        super();
        this.socialSecurityNumber = socialSecurityNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
