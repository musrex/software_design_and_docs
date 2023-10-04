package com.merrimack.week5;

/**
 * @author leandro
 */

import java.util.Stack;

/**
 * The App class holds our main method and runs the program.
 *
 */
public class App{
    /**
     * Default constructor body for the App class
     */
    public App() {
    // Default constructor body for the App class
    }

    /**
     * Our main method - runs our program.
     * @param args Command-line arguments (not used for this application).
     */
    public static void main(String[] args) {
        // Create a Reader object and add numbers
        Reader reader = new Reader ();
        reader.readNumbers();
        reader.sortNumbers();

        // Create a Stacker object and add numbers to the stack
        Stacker stacker = new Stacker();
        stacker.addNumbersToStack(reader.getTempNums());

        // Print the divider line, followed by the Stack
        System.out.println("-----");
        Stack<Integer> displayedStack = stacker.getStack();
        while (!displayedStack.isEmpty()) {
            System.out.println(displayedStack.pop());
        }
    }
}
