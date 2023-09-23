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
 * Represents an author.
 */
public class Author {
    private final String name;

    /**
     * Constructs an Author object.
     * @param name The name of the Author.
     */
    
    public Author(String name) {
        this.name = name;
    }

    /**
     * This method returns Author name.
     * @return The name of the Author.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the Authors name.
     * @return A string representation of the Author.
     */
    @Override
    public String toString() {
        return name;
    }
}