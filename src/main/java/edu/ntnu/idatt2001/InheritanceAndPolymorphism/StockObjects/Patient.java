package edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects;

public class Patient extends Person{
    private String generalPractitioner;

    public Patient(String name, String generalPractitioner){
        super(name);
        this.setGeneralPractitioner(generalPractitioner);
    }

    public String getGeneralPractitioner() {
        return generalPractitioner;
    }

    public void setGeneralPractitioner(String generalPractitioner) {
        this.generalPractitioner = generalPractitioner;
    }

    @Override
    public String toString() {
        return "\nPatient:" +
                "\nGeneral Practitioner = " + generalPractitioner +
                "\n" + super.toString();
    }
}
