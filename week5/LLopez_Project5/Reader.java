/**
 *
 * @author leandro
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.List;

import java.util.Collections;

/**
 *
 * Reader takes user input as integer numbers and adds it to a linkedlist
 */
public class Reader {
    // the following are all private because they don't need to be accessed
    // or changed, i.e. we're not deleting elements from the stack
    private static Stack<Integer> numbers = new Stack<Integer>();
    private static List<Integer> tempnums = new List<Integer>();
    private Scanner input = new Scanner(System.in);
    // this is also private, but we add final to tell the compiler
    // this string is final and unchanging, unlike the stack which does get
    // added to doesn't get manipulated otherwise
    private final String errorMessage = "Please enter a valid number or 'done'.";
    
    public void readNumbers() {
        Boolean run = true;
        String userInput;
        /*
         * we use processed input to hold the lowercase input string, that way
         * Done, DONE, done, dOne, etc., are all the same.
         */
        String processedInput;
        
        String textBlock = """
            Welcome! Enter a number to add to the LinkedList.
            Numbers will be sorted, smallest to largest.
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
                    tempnums.add(n);
                } catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }

        input.close();
    }
}
