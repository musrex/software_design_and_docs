package.merrimack.reader;

/**
 *
 * @author Leandro Lopez
 */

import java.util.LinkedList;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<>();

    }
}package com.merrimack.Reader;

/**
 * 
 * @author Leandro Lopez
 */

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * This program takes input from the user in the form of integer numbers
 * and adds it to a LinkedList, sorting the numbers from smallest to largst.
 */
public class Reader {
    private LinkedList<String> numbers;
    
    public static void main(String[] args) {
        Boolean run = true;
        Scanner input = new Scanner(System.in);
        int n;

        String textBlock = """
            Welcome! Enter a number to add to the LinkedList.
            Numbers will be sorted, smallest to largest.
            When you are done, enter: done
            """;
        System.out.println(textBlock);

        while (run) {
           n = input.nextInt();

        }
        
    }
}
