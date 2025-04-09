import java.util.Scanner;
class Sports{
String sport;
int Rating;
Sports(String spo,int ra){
sport=spo;
Rating=ra;
}
}
class Student extends Sports{
String Grade;
double overall_per;
Student(String spo,int ra,String gd,double per){
super(spo,ra);
Grade=gd;
overall_per=per;
}
}
public class Result extends Student{
Result(String spo,int ra,String gd,double per){
super(spo,ra,gd,per);
}
void display(){
System.out.println("\nSports details of Student");
System.out.println("\nSport:"+sport);
System.out.println("\nRating:"+Rating);
System.out.println("\nAcademic details of student");
System.out.println("\nAcademic Grade:"+Grade);
System.out.println("\nOverall percentage :"+overall_per);
}
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
System.out.println("\nEnter the number of students:");
int num=sc1.nextInt();
Result[] arr=new Result [num];
for(int i=0;i<num;i++){


Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the sports details of student");
System.out.println("\nSport:");
String sport=sc.next();
System.out.println("\nSport Rating out of 10:");
int Rating=sc.nextInt();
System.out.println("\nenter the academic details of Student");
System.out.println("\nAcademic Grade:");
String Grade=sc.next();
System.out.println("\nOverall percentage:");
double overall_per=sc.nextDouble();
arr[i]=new Result(sport,Rating,Grade,overall_per);
}
System.out.println("\n--------Information of Students------\n");
for(int i=0;i<num;i++)
{
arr[i].display();
System.out.println("\n----------------------\n");
}
sc1.close();
}
}