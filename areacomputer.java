 import java.util.*;
class areacomputer{
int a;
int area;
float x;
double y;
void area(int l,int b){
int length=l;
int breadth=b;
a=length*breadth;
System.out.println("->Area:"+a);
}
void area(int s){
int side=s;
area=side*side;
System.out.println("->Area:"+area);
}
void area(float b,float h){
float base=b;
float height=h;
x=(base*height)/2;
System.out.println("->Area:"+x);
}
void area(double r){
double radius=r;
y=3.14*radius*radius;
System.out.println("->Area:"+y);
}
public static void main(String[] args){
areacomputer obj=new areacomputer();
Scanner sc=new Scanner(System.in);
System.out.println("*****Area of different shapes using overloaded functions*****");
System.out.println("\n___RECTANGLE____");
System.out.println("->enter the length and breadth:");
int l=sc.nextInt();
int b=sc.nextInt();
obj.area(l,b);
System.out.println("\n___SQUARE____");
System.out.println("->enter the sides:");
int s=sc.nextInt();
obj.area(s);
System.out.println("\n___TRIANGLE____");
System.out.println("->enter the base and height:");
float base=sc.nextFloat();
float h=sc.nextFloat();
obj.area(base,h);
System.out.println("\n___CIRCLE____");
System.out.println("->enter the radius:");
double r=sc.nextDouble();
obj.area(r);
sc.close();
}
}

