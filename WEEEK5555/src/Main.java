import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       Employee employee1 = new Employee(1,"asko",12.233);
        Employee employee2 = new Employee(2,"lısko",12.233);
        Employee employee3 = new Employee(345,"oala",12.233);
        Employee employee4 = new Employee(36,"rruy",12.233);
        Employee employee5 = new Employee(77,"mmmza",12.233);

        Employee[] employees = {employee1, employee2, employee3};
        Company company = new Company(employees);

        company.printAllEmployees();


    }
}