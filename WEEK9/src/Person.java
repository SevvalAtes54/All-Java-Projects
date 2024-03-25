public class Person {
    private static int nextId = 1;
    private int id;
    private String firstName;
    private String lastName;
    private int age;

 
    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }


    public Person(int id) {
        this.id = id;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
    }


    public Person() {
        this.id = nextId++;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.age = 0;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println();
    }


}
