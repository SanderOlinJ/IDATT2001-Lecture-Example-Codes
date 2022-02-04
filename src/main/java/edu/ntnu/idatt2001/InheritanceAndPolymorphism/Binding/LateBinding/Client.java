package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Binding.LateBinding;

public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.walk();

        Human human = new Human();
        human.walk();

        // Late Binding
        // Here we have to have instances of Boy and Human
        // since we haven't made the walk() method static.
    }
}
