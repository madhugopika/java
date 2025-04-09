import java.util.Scanner;
class Person {
String name;
String gender;
String address;
int age;
public Person(String name, String gender, String address, int age) {
  this.name = name;
  this.gender = gender;
  this.address = address;
  this.age = age;
 }
}
class Employee extends Person {
    String empid;
    String companyName;
    String qualification;
    double salary;
public Employee(String name, String gender, String address, int age, String empid, String companyName, String qualification, double salary) {
        super(name, gender, address, age); 
        this.empid = empid;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
 }
}
class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;
public Teacher(String name, String gender, String address, int age, String empid, String companyName, String qualification, double salary, String subject, String department, String teacherId) {
        super(name, gender, address, age, empid, companyName, qualification, salary); 
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }
 public void displayDetails() {
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("EmpID: " + empid);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("************************************");
 }
}
class main1{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of teachers: ");
int numTeachers = scanner.nextInt();
scanner.nextLine();  
for (int i = 0; i < numTeachers; i++) {
System.out.println("\nEnter details for Teacher " + (i + 1));
System.out.print("Name: ");
String name = scanner.nextLine();
System.out.print("Gender: ");
String gender = scanner.nextLine();
System.out.print("Address: ");
String address = scanner.nextLine();
System.out.print("Age: ");
int age = scanner.nextInt();
scanner.nextLine();  
System.out.print("Employee ID: ");
String empid = scanner.nextLine();
System.out.print("Company Name: ");
String companyName = scanner.nextLine();
System.out.print("Qualification: ");
String qualification = scanner.nextLine();
System.out.print("Salary: ");
double salary = scanner.nextDouble();
scanner.nextLine(); 
System.out.print("Subject: ");
String subject = scanner.nextLine();
System.out.print("Department: ");
String department = scanner.nextLine();
System.out.print("Teacher ID: ");
String teacherId = scanner.nextLine();
Teacher teacher = new Teacher(name, gender, address, age, empid, companyName, qualification, salary, subject, department, teacherId);
teacher.displayDetails();
}
scanner.close();  
}
}
