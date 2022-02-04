package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Attributes;
import static edu.ntnu.idatt2001.utilities.Out.*;
public class Client {
    public static void main(String[] args) {

        Person person = new Person("31126120041","Odd","Even","Primtallet");

        //person.setSocialSecurityNumber("29046942069")
        //This does not work as the attribute socialSecurityNumber is final
        //This means that it can only be assigned once, at its inception, and no more.
    }
}
