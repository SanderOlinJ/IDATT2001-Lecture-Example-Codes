package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Methods;

public class Patient extends Person{
    private Person generalPractitioner;

    protected Patient(String socialSecurityNumber, String firstName, String middleName,
                      String surName, Person generalPractitioner){
        super(socialSecurityNumber, firstName, middleName, surName);
        this.generalPractitioner = generalPractitioner;
    }

    public Person getGeneralPractitioner() {
        return generalPractitioner;
    }

    public void setGeneralPractitioner(Person generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "generalPractitioner=" + generalPractitioner +
                super.toString() + '}';
    }
}
