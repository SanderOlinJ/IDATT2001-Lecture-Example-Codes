package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1.WildAnimals;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals1.Pets.Dog;

public class Lion {
    public void playWith(Dog dog) {
        //dog.waveTail();
    }
}

// Doesn't work since the waveTail() method in Dog, is protected.
