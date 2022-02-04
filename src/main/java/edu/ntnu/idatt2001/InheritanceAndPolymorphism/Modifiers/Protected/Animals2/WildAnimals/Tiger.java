package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals2.WildAnimals;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Protected.Animals2.Pets.Dog;

public class Tiger extends Dog{
    public void play(){
        //this.waveTail();
        //Does not work either since we made Dog constructor protected
    }
}
