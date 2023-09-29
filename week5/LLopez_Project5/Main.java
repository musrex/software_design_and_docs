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

    


    // Sorting the numbers
    Collections.sort(numbers);

    // Displaying the sorted numbers
    System.out.println("Sorted Numbers: " + numbers);
    
}}

