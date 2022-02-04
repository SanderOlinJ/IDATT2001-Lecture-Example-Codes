package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Casting.Objects;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Employee;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Manager;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Patient;
import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Person;

import static edu.ntnu.idatt2001.utilities.Out.*;


public class Client {
    public static void main(String[] args) {
        Employee employee = new Employee("Ola Nordmann");
        Manager manager = new Manager("Ola Nordmann", 550000, "Director");

        // Down-casting

        Person employeeToPerson1 = (Person) employee;
        out(employeeToPerson1);

        Person managerToPerson1 = (Person) manager;
        out(managerToPerson1);

        Employee managerToEmployee = (Employee) manager;
        out(managerToEmployee);

        // All 3 down-castings above works 100%, as they are direct descendants.

        Patient patient = new Patient("Hans Hansen", "Anette Olsen");
        Person patientToPerson1 = (Person) patient;
        out(patientToPerson1);

        // This down-casting also works, even though it's not related to Employee or Manager.
        // But since it's descendant of Person.

        // Patient, however, cannot be cast into neither Employee nor Manager, and vice versa,
        // since they are not related.

        // Up-casting

        Employee personBackToEmployee = (Employee) employeeToPerson1;
        out(personBackToEmployee);

        Manager personBackToManager = (Manager) managerToPerson1;
        out(personBackToEmployee);

        Patient personBackToPatient = (Patient) patientToPerson1;
        out(personBackToPatient);

        // All these up-castings works, as they are each up-cast back into their respectively previous class

        //Patient personWhoWasEmployeeToPatient = (Patient) employeeToPerson1;
        //out(personWhoWasEmployeeToPatient);
        // This method does not work (RUNTIME ERROR) as it casts a Person who was an Employee into a Patient.
        // These objects are not connected.

        //Manager employeeToManager = (Manager) personBackToEmployee;
        //out(employeeToManager);
        // Cannot cast Employee up to Manager

        //Person person = new Person("Ola Olavson");
        //Employee personToEmployee = (Employee) person;
        //out(personToEmployee);
        // Cannot cast Person up to Employee.
    }




}
