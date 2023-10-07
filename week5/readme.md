# Reader Program  
## Leandro Lopez  
## Software Design and Docs - Week 5  
  
This program reads user input, sorts it, and adds it to a stack.  
  
**Note: Refer to LLopez_Project 5 folder - that is the final version.**  
  
Classes:  
---  
  
**App.java** - The App class holds our main method and runs the program  
  
**Reader.java** - Reader takes user input as integer numbers and adds it  
to a linkedlist. This class has access to the following methods:  
- readNumbers():This method reads numbers input by the user and places them  
in an ArrayList.  
- sortNumbers(): This method sorts the numbers in our ArrayList.  
- getTempNums(): This method returns the ArrayList.  

**Stacker.java** - This class sorts the list and inserts it into a stack.   
This class access to the following methods:  
- addNumbersToStack(): This method adds numbers to the stack created by the   
Stacker class.  
- getStack(): This method returns our stack.  
