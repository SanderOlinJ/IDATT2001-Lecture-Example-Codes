package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1.Pets;
import static edu.ntnu.idatt2001.utilities.Out.*;
public class Cat {
    public void playWith(Dog dog){
        out("Cat is playing with dog...");
        dog.waveTail();
    }
}
