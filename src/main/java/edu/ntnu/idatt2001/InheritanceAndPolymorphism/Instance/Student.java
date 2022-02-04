package edu.ntnu.idatt2001.InheritanceAndPolymorphism.Instance;

import edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects.Person;

public class Student extends Person {
    private int studentNr;

    public Student(String name, int studentNr){
        super(name);
        this.studentNr = studentNr;
    }

    public void setStudentNr(int studentNr) {
        this.studentNr = studentNr;
    }

    public int getStudentNr() {
        return studentNr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNr=" + studentNr + ", " +
                super.toString() + '}';
    }
}
