public class Employee {

    final static String CompanyName = "GOOGLE";
    private Double salary;
    private String name;
    private int id;

    public static int  counter;
    public static String getCompanyName(){
return CompanyName;
    }
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    String getName(){
return  name;
    }
    Employee(int id,String name,Double salary){
this.id = id;
this.name  = name;
this.salary = salary;
counter ++;
    }

}
