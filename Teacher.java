import java.util.Scanner;
class Employee {
      int Empid;
      String Name;
      double Salary;
      String Address;
      Employee(int no, String na, double sal, String add) {
          this.Empid = no;
          this.Name = na;
          this.Salary = sal;
          this.Address = add;
    }
}
class Teacher extends Employee {
     String dept;
     String subject;
     Teacher(int no, String na,double sal,String add,String dep,String sub) {
       super(no,na,sal,add);
       this.dept = dep;
       this.subject = sub;
  }
void display() {
      System.out.println("Employee id: " +Empid);
      System.out.println("Name: " +Name);
      System.out.println("Salary: " +Salary);
      System.out.println("Address: " +Address);
      System.out.println("Department: " +dept);
      System.out.println("Subject: " +subject);
}
public static void main(String[] args) {
      System.out.println("\nEnter the no.of Employees");
      Scanner sc1 = new Scanner(System.in);
      int num = sc1.nextInt();
      Teacher[] arr = new Teacher[num];
   for (int i=0; i<num; i++) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter employee id:");
        int Empid = sc.nextInt();
        System.out.println("\nEnter employee name:");
        String Name = sc.next();
        System.out.println("\nEnter the salary :");
        int Salary = sc.nextInt();
        System.out.println("\nEnter address:");
        String Address = sc.next();
        System.out.println("\n Enter department:");
        String dept = sc.next();
        System.out.println("\n Enter subject:");
        String subject = sc.next();
        arr[i] = new Teacher(Empid,Name,Salary,Address,dept,subject);
}
System.out.println("\n******Informations of all the Employees *********");
for(int i=0;i<num; i++) {
   arr[i].display();
  }
     sc1.close();
   }
}