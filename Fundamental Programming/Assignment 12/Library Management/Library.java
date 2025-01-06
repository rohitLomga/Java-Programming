package Assignment_12._Library_Management;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    // Constructor
    public Library(){
        books = new ArrayList<>();
    }

    // Method to add books
    public void addBook(Book book){
        for(Book b : books){
            if(b.getIsbn().equals(book.getIsbn())){ // Checking whether the isbn code is already there
                System.out.println("This isbn code already exists");
                return;
            }
        }
        books.add(book); // Adding the new book in the library with add() method
    }

    // Method to remove the book from the library
    public void removeBook(String isbn){
        for(Book b : books){
            if(b.getIsbn().equals(isbn)){
                books.remove(b);
                System.out.println("Book is removed from the library");
            }else {
                System.out.println("Book is not found");
            }
        }
    }

    // Method to list down the given books
    public void bookList(){
        if(books.isEmpty()){
            System.out.println("Library is empty");
        }else {
            for(Book b : books){
                System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
            }
        }

    }
}
