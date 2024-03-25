import java.util.Scanner;

public class worker {
    // Attributes
    private String name;
    private int id;
    private float wage;
    private int workingHours;

    // Constructor
    public worker(String name, int id, float wage, int workingHours) {
        this.name = name;
        this.id = id;
        this.wage = wage;
        this.workingHours = workingHours;
    }

    // Behaviors
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Social Security Number: " + id);
    }

    public void displaySalary() {
        float salary = wage * workingHours;
        System.out.println("Salary: $" + salary);
    }
}