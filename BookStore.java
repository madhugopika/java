import java.util.Scanner;
class Book{
int accessionNumber;
String title;
String author;
String edition;
String publisher;
void acceptBookInfo() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Accession Number: ");
accessionNumber = sc.nextInt();
System.out.print("Enter Title: ");
title = sc.next();
System.out.print("Enter Author: ");
author = sc.next();
System.out.print("Enter Edition: ");
edition = sc.next();
System.out.print("Enter Publisher: ");
publisher = sc.next();
}
void displayBookInfo() {
System.out.println("Accession Number: " + accessionNumber);
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Edition: " + edition);
System.out.println("Publisher: " + publisher); }
}
public class BookStore {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of books: ");
int n = sc.nextInt();
Book[] books = new Book[n];
for (int i = 0; i < n; i++) {
System.out.println("\nEnter details for Book " + (i + 1));
books[i] = new Book();
books[i].acceptBookInfo();
        }
System.out.print("\nEnter the Accession Number to search: ");
int searchAccession = sc.nextInt();
 boolean found = false;
 for (int i = 0; i < n; i++) {
 if (books[i].accessionNumber == searchAccession) {
 System.out.println("\nBook found with Accession Number " + searchAccession + ":");
 books[i].displayBookInfo();
 return; 
 }
}
 System.out.println("No book found with Accession Number " + searchAccession);
 }
}       