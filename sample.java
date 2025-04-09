import java.util.Scanner;
class Publisher{
String publisher;
publisher(String pub){
this.publisher=pub;
}
}
class Book extends Publisher{
String book;
Book(String pub,String boo){
super(pub);
book=boo;
}
}
class Literature extends Book{
String category;
Literature(String pub,String boo){
super(pub,boo);
}
void display(){
System.out.println("publisher:"+publisher);
System.out.println("Book:"+book);
}
}
void display(){
System.out.println("publisher:"+publisher);
System.out.println("Book:"+book);
}
}
