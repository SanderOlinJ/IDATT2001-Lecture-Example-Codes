package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Instance;

import java.util.ArrayList;
import static edu.ntnu.idatt2001.utilities.Out.*;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Person;

public class Client {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Student("Hans Hansen", 123456));
        persons.add(new Teacher("Ola Nordmann"));
        out(persons);

        for (Person person : persons){
            if (person instanceof Teacher) {
                ((Teacher) person).setSalary(5000000);
            } else if (person instanceof Student) {
                ((Student) person).setStudentNr(8001001);
            }
        }

        out(persons);


    }
}
