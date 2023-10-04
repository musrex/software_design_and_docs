package com.merrimack.week5;
/**
 *
 * @author leandro
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Reader takes user input as integer numbers and adds it to a linkedlist
 */
public class Reader {
    /**
     * Default constructor body for Reader class
     */
    public Reader() {
        // default constructor body
        }
    // Constructor for the reader class
    private static List<Integer> tempNums = new ArrayList<Integer>();
    private Scanner input = new Scanner(System.in);
    private final String errorMessage = "Please enter a valid number or 'done'.";
    
    /**
     * This method reads numbers input by the user and places them
     * in an ArrayList. Parameters (user input) are 
     * handled via the Scanner object.
     */
    public void readNumbers() {
        Boolean run = true;
        String userInput;
        // we use processed input to hold the lowercase input string, that way
        // Done, DONE, done, dOne, etc., are all the same.
        String processedInput;
        
        String textBlock = """
            Welcome! Enter a number to add to the Stack.
            Numbers will be sorted:
            9 - largest
            8
            4
            3
            1 - smallest.
            When you are done, enter: done
            """;
        System.out.println(textBlock);

        while (run) {
            userInput = input.nextLine().trim(); // Read the user input as a string
            processedInput = userInput.toLowerCase();
            if (processedInput.equalsIgnoreCase("done")) {
                run = false;
                break;
            } else {
                try {
                    int n = Integer.parseInt(processedInput);
                    tempNums.add(n);
                } catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }

        input.close();
    }
    /**
     * This method sorts the numbers in our ArrayList
     */
    public void sortNumbers() {
        Collections.sort(tempNums);
    }
    /**
     * This method returns the ArrayList
     * @return tempNums Our temporary ArrayList for the Stack.
     */
    public List<Integer> getTempNums() {
        return tempNums;
    }
}
