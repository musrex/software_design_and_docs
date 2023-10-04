package com.merrimack.week5;

/**
 * 
 * @author leandro
 */

import java.util.Stack;
import java.util.List;

/**
  * This class sorts the list and inserts it into a stack.
  */
public class Stacker{
    /**
     * Default constructor body for Stacker class
     */
    public Stacker(){
    // Default constructor body for Stacker class 
    }
    private Stack<Integer> stack = new Stack<Integer>();

    /**
     * This method adds numbers to the stack created by the Stacker class.
     * @param numbers a list of numbers
     */
    public void addNumbersToStack(List<Integer> numbers) {
        for (int num : numbers) {
            stack.push(num);
        }
    }
    
    /**
     * This method returns our stack.
     * @return stack Our ordered stack, from first (smallest) to last (largest)
     */
    public Stack<Integer> getStack() {
        return stack;
    }
}
