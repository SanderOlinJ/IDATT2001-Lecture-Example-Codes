package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Class1;

public class Client {
    public static void main(String[] args) {
        Vehicle.move(new Car());
        Vehicle.move(new Airplane());

        //Since move() in vehicle is static, we don't have to instantiate a Vehicle.
        //Now the move() method takes in a Car object as a parameter, which means it has to be Car.
        //But since Airplane is a subclass of Car, it is allowed as a parameter to move().
        //Now this is stupid because an airplane is obviously not a car
        //This can be fixed by making the Car class final
        //See Class2 as an example
    }
}
