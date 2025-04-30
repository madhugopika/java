package Graphics;
import java.util.Scanner;
interface figures{
void rectangle();
void triangle();
void square();
void circle();
}
public class Area implements figures{
Scanner s=new Scanner(System.in);
public void rectangle(){
System.out.println("enter the length:");
int l=s.nextInt();
System.out.println("enter the breadth:");
int b=s.nextInt();
System.out.println("area of the rectangle:"+(l*b));
}
public void triangle(){
System.out.println("enter the base:");
int base=s.nextInt();
System.out.println("enter the height:");
int h=s.nextInt();
System.out.println("area of the triangle:"+(0.5*base*h));
}
public void square(){
System.out.println("enter the side:");
int side=s.nextInt();
System.out.println("area of the square:"+(side*side));
}
public void circle(){
System.out.println("enter the radius:");
float r=s.nextFloat();
System.out.println("area of the circle:"+(Math.PI*r*r));
}
}         



