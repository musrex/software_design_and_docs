/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package merrimack.bookstore;

/**
 *
 * @author leandro
 */

/**
 * Represents a bookstore with a collection of books.
 */
import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private List<Book> books;

    public Bookstore() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a book to the bookstore's collection.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Lists all the books in the bookstore's collection.
     */
    public void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    /**
     * The main method, creates author and book objects, adds the books
     * to the bookstore, and the prints out a list of the collection.
     * @param args 
     */
    public static void main(String[] args) {
        Author vonnegut = new Author("Kurt Vonnegut");
        Author dick = new Author("Philip K. Dick");

        Book night = new Book("Mother Night", vonnegut);
        Book electric_sheep = new Book("Do Androids Dream "
                + "of Electric Sheep?",dick);

        Bookstore bookstore = new Bookstore();
        bookstore.addBook(night);
        bookstore.addBook(electric_sheep);

        bookstore.listBooks();
    }
}
