package com.javatasks.constructoObjects;

//Create an array of objects of the class Book and display their properties[like id , name etc,...]

//Define the LibraryBook class
class LibraryBook {
 // Attributes of the LibraryBook class
 int id;
 String title;
 String author;
 double price;

 // Constructor to initialize the LibraryBook object
 public LibraryBook(int id, String title, String author, double price) {
     this.id = id;
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display the properties of the library book
 public void displayDetails() {
     System.out.println("Book ID: " + id);
     System.out.println("Book Title: " + title);
     System.out.println("Book Author: " + author);
     System.out.println("Book Price: $" + price);
     System.out.println();
 }
}

public class BookArrayExample {
 public static void main(String[] args) {
     // Create an array of LibraryBook objects
     LibraryBook[] libraryBooks = new LibraryBook[3];  // Array to store 3 LibraryBook objects

     // Initializing the LibraryBook objects in the array
     libraryBooks[0] = new LibraryBook(101, "Java Programming", "John Doe", 29.99);
     libraryBooks[1] = new LibraryBook(102, "Data Structures", "Jane Smith", 34.99);
     libraryBooks[2] = new LibraryBook(103, "Algorithm Design", "James Brown", 39.99);

     // Display the details of each library book in the array
     for (int i = 0; i < libraryBooks.length; i++) {
         libraryBooks[i].displayDetails();  // Calling displayDetails method for each book
     }
 }
}

