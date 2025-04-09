import java.util.Scanner;
class Vehicle{
float mileage;
int price;
Vehicle(float mi,int pr){
mileage=mi;
price=pr;
}
}
class Car extends Vehicle{
float ownership_score;
int warranty;
int seating_capacity;
String fuel_type;
Car(float mi,int pr,float ow,int wa,int se,String fu){
super(mi,pr);
 ownership_score=ow;
 warranty=wa;
 seating_capacity=se;
 fuel_type=fu;
}
}
public class Maruthi extends Car{
String model_type;
Maruthi(float mi,int pr,float ow,int wa,int se,String fu,String mo)
{
super(mi,pr,ow,wa,se,fu);
model_type=mo;
}
void display() {
System.out.println("\nInformation about Vehicle:");
System.out.println("\nmileage:"+mileage);
System.out.println("\nprice:"+price);
System.out.println("\nInformation about car:");
System.out.println("\nownership_score:"+ownership_score);
System.out.println("\nwarranty:"+warranty);
System.out.println("\nseating_capacity"+seating_capacity);
System.out.println("\nfuel_type:"+fuel_type);
System.out.println("\nInformation about Maruthi:");
System.out.println("\nmodel_type:"+model_type);
}
public static void main(String[] args){
Scanner sc1=new Scanner(System.in);
System.out.println("\nEnter the number of Maruthi Cars:");
int num=sc1.nextInt();
Maruthi[] arr=new Maruthi[num];
for(int i=0;i<num;i++){
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter the car details ");
System.out.println("\nmileage:");
float mileage=sc.nextFloat();
System.out.println("\ncar price:");
int price=sc.nextInt();

System.out.println("\nenter the car details");
System.out.println("\nownership_score:");
float ownership_score=sc.nextFloat();
System.out.println("\nwarranty:");
int warranty=sc.nextInt();
System.out.println("\nseating_capacity:");
int seating_capacity=sc.nextInt();
System.out.println("\nfuel_type:");
String fuel_type=sc.next();
System.out.println("\nmodel_type:");
String model_type=sc.next();
arr[i]=new Maruthi(mileage,price,ownership_score,warranty, seating_capacity,fuel_type,model_type);
}
System.out.println("\n--------Information of Vehicles------\n");
for(int i=0;i<num;i++)
{
arr[i].display();
System.out.println("\n----------------------\n");
}
sc1.close();
}
}

