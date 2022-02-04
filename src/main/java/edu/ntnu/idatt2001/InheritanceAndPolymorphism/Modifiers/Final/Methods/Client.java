package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Modifiers.Final.Methods;
import static edu.ntnu.idatt2001.utilities.Out.*;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("31126018440","Odd",
                "Even","Primtallet",45000));
        persons.add(new Manager("01126228500","Hans",
                "Jakob","Hansen",550000,"AIT"));

        Person generalPractitioner = new Person("15018028621",
                "Dr. Ingrid", "", "Andersen");
        persons.add(new Patient("01126228112","Hanne",
                "","Johansen",generalPractitioner));

        out(persons);
        for (Person person : persons){
            if (!(person instanceof Patient)){
                Employee employee = (Employee) person;
                employee.setSalary(employee.getSalary() * 1.05);
            }
        }

        out(persons);
    }
}
