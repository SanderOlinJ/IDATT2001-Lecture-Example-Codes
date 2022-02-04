package edu.ntnu.idatt2001.InheritanceAndPolymorphism.StockObjects;

public class Manager extends Employee {
    private String title;

    public Manager(String name, double salary, String title){
        super(name, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "title='" + title + '\'' +
                super.toString() + '}';
    }
}
