package Assignment_12._Library_Management;

public class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn =isbn;
    }

    // using getters method to return the value of attribute
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

}