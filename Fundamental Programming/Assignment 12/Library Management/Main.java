package Assignment_12._Library_Management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        System.out.println("How many books you want to store in the library : ");
//        int size = scanner.nextInt();
//        Library library = new Library(size);

//        library.addBook();

        Library library = new Library();
        int choice;

        System.out.println("--- Library System ---");

        do {
            System.out.println("\n 1 . Add books");
            System.out.println(" 2 . Remove books");
            System.out.println(" 3 . List books");
            System.out.println(" 0 . Exit");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice){
                case 1:
                    System.out.println("\nEnter the title of the book : ");
                    String title = scanner.nextLine();

                    System.out.println("Enter the author of the book : ");
                    String author = scanner.nextLine();

                    System.out.println("Enter the isbn code : ");
                    String isbn = scanner.nextLine();

                    Book book = new Book(title,author,isbn); // Making new object of the class Book

                    library.addBook(book);

                    break;

                case 2:
                    System.out.println("\nEnter the isbn code of the book to remove the book : ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;

                case 3:
                    library.bookList();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice ! Enter the correct number");

            }
        }while (choice != 0);
    }
}
