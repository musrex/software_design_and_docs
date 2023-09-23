/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merrimack.bookstore;

/**
 *
 * @author leandro
 */

/**
 * 
 * Represents a book with a title and author.
 */
public class Book {
    private final String title;
    private final Author author;
    
    /**
     * Constructs a book object with title and author.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Returns the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Returns a string representation of the book title and author.
     * @return A string representation of the book title and author.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author.toString();
    }
}