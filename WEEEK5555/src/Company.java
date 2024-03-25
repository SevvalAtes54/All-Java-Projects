public class Company {
  private  Employee employees[];

  public void printAllEmployees(){
    for (Employee emp: employees
         ) {

      System.out.println( emp );
    }
  }

    public Employee[] getEmployees(){
      return this.employees;
    }

     Company(Employee[] employees){
      this.employees = employees;
    }
}
