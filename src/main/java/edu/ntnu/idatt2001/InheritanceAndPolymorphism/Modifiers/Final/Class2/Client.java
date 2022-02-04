package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Class2;

public class Client {

    public static void main(String[] args) {

        Vehicle.move(new Car());
        //Vehicle.move(new Airplane());

        //Since Car is final, it won't extend to a subclass.
        //In this case, Airplane
        //Therefore, Airplane does not inherit anything from Car.
        //Quick fix, nice!
    }
}
