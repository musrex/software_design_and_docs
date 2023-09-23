Leandro Lopez  
Software Design and Documentation - CSC 6301  
Merrimack College  

# Week 3 Project

This code follows both, the Encapsulation and Modularity principles.  
  
## Encapsulation  
We can see the encapsulation principle at play in the way out Classes are created.  
The important information, such as the author, book titles, and bookstore collections  
are all set to private. This doesn't allow outside methods or classes to interact  
with them. We also have the final keyword used, which lets the compiler know once  
these variables are set, they will no longer change.  

We have getter methods that allow us to see the data within our objects, but once  
our objects are instantiated with their relevant data, that data is no longer changing.  

## Modularity  
This code also follows the modularity principle. Classes handle singular  
responsibilities. The Author class contains just the author name, the book class  
is responsible for holding relevant book information (author, title), and the  
bookstore class just holds our collection, and contains our main method that  
instantiates our program and prints out the relevant information. To further  
demonstrate this codes modularity, one could add another class like 'Publisher'  
or 'Price' without having to modify the code much at all. 