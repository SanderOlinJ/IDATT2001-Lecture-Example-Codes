package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Binding.EarlyBinding;

public class Client {

    public static void main(String[] args) {
        Boy.walk();
        Human.walk();

        // Early Binding
        // Since we have made the walk() method static
        // then we don't need to an instance of Boy or Human
    }
}
