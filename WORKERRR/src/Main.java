import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        worker worker1 = new worker("John Doe", 123456789, 15.0f, 40);


        System.out.println("Worker 1:");
        worker1.displayInfo();
        worker1.displaySalary();


        Scanner scanner = new Scanner(System.in);

        System.out.println("deails:");
        System.out.print("name ");
        String name2 = scanner.nextLine();

        System.out.print("id: ");
        int ssn2 = scanner.nextInt();

        System.out.print("wage ");
        float wage2 = scanner.nextFloat();

        System.out.print("hour: ");
        int hours2 = scanner.nextInt();

        worker worker2 = new worker(name2, ssn2, wage2, hours2);
        System.out.println("worker 2:");
        worker2.displayInfo();
        worker2.displaySalary();

        scanner.close();
    }
}



