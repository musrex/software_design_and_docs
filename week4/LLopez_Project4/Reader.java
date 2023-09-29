/**
 *
 * @author leandro
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * Reader takes user input as integer numbers and adds it to a linkedlist
 */
public class Reader {
    private static LinkedList<Integer> numbers = new LinkedList<Integer>();
    
    /**
     *
     *Our main method - instantiates our program, prompts user for input, and
     * then adds the input to a LinkedList
     * @params String[] args Because this is our main method, it takes in the
     * default parameters main methods take. However, once our programming is
     * running, it'll prompt the user for input that will then be stored as
     * an int in a linked list and sorted smallest to largest.
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        String processedInput;

        String errorMessage = "Please enter a valid number or 'done'.";
        
        String textBlock = """
            Welcome! Enter a number to add to the LinkedList.
            Numbers will be sorted, smallest to largest.
            When you are done, enter: done
            """;
        System.out.println(textBlock);

        Boolean run = true;
        while (run) {
            userInput = input.nextLine().trim(); // Read the user input as a string
            processedInput = userInput.toLowerCase();
            if (processedInput.equalsIgnoreCase("done")) {
                run = false;
                break;
            } else {
                try {
                    int n = Integer.parseInt(processedInput);
                    numbers.add(n);
                } catch (NumberFormatException e) {
                    System.out.println(errorMessage);
                }
            }
        }

        input.close();

        // Sorting the numbers
        Collections.sort(numbers);

        // Displaying the sorted numbers
        System.out.println("Sorted Numbers: " + numbers);
        
    }}
