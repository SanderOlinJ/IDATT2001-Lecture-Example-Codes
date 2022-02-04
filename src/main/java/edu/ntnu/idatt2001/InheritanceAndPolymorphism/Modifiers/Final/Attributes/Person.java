package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Attributes;

public class Person {
    private final String socialSecurityNumber;
    private String firstName;
    private final String middleName;
    protected String surName;

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

    public void setFirstName(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /*public String setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }*/
    //This doesn't work as the attribute socialSecurityNumber is final

    public String getMiddleName() {
        return middleName;
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
