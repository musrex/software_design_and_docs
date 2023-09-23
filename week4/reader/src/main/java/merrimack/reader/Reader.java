/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package merrimack.reader;

/**
 *
 * @author leandro
 */
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class Reader {
    private static LinkedList<Integer> numbers = new LinkedList<Integer>();
    
    public static void main(String[] args) {
        Boolean run = true;
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
