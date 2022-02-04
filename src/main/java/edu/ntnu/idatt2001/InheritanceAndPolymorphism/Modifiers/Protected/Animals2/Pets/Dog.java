package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals2.Pets;
import static edu.ntnu.idatt2001.utilities.Out.*;
public class Dog {
    //By defining the constructor as protected, subclasses can't "cheat" themselves to methods.
    //The protected constructor now makes sure that no subclasses are allowed to inherit the superclass' methods.
    protected Dog(){}

    void waveTail(){
        out("Dog: Waving my tail");
    }
}
