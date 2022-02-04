package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1.Pets.*;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1.WildAnimals.*;

public class Client {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.playWith(dog);

        //This does not work
        Lion lion = new Lion();
        lion.playWith(dog);
        //Read in Lion class why

        //This works, because it extends the dog class
        Tiger tiger = new Tiger();
        tiger.play();

        //But in some cases, it shouldn't work.
        //Therefore we need a fix
        //See Animals2 for fix
    }
}
