import java.util.Scanner;
 class Employee {
 public String eno;
 public String ename;
 public int esalary;
 public Employee(String eno,String ename,int salary)
 {
 this.eno = eno;
 this.ename = ename;
 this.esalary = salary;
 }
}
 class main {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
  System.out.print("Enter count of employee list :");
  int count = Integer.parseInt(scan.nextLine());
  Employee[] employees = new Employee[count];
  for (int i=0;i<count;i++)
  {
  System.out.print("Enter number of employee :");
  String eno = scan.nextLine();
  System.out.print("Enter the name of the employee:");
  String ename = scan.nextLine();
  System.out.print("Enter salary of employee:");
  int esalary = Integer.parseInt(scan.nextLine());
  employees[i] = new Employee(eno,ename,esalary);
  }
  System.out.println("Enter the number of employee to be filtered out :");
  String search = scan.nextLine();
  for (int i=0;i<count;i++){
  if(employees[i].eno.equals(search))
  {
  System.out.println("Employee number : "+employees[i].eno);
   System.out.println("Employee name : "+employees[i].ename);
 System.out.println("Employee salary : "+employees[i].esalary);
}
}
}
}

  