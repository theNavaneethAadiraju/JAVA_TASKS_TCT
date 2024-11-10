package com.javatasks.constructoObjects;

// Create a class Book with a constructor that assigns default values to the attributes.

public class Book {

    // Attributes of the Book class
    String title;
    String author;
    double price;

    // Constructor to assign default values to the attributes
    public Book() {
        title = "Unknown Title";  // Default value for title
        author = "Unknown Author";  // Default value for author
        price = 0.0;  // Default value for price
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an object of the Book class
        Book myBook = new Book();

        // Displaying the details of the book
        myBook.displayDetails();  // This will display the default values
    }
}

