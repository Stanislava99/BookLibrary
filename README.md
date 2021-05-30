# BookLibrary

This project solves the requirements of first and second exercise for Polar Cape's Graduate Program test.

As asked, 4 classes were made.

Class Book is a class that contains information about the book, its title, ISBN, type, release date and author. 
It also has 3 functions: 

  toString() - returns the name of the book, author's name and year of release;
  getYear() - getter that returns the year;
  getAuthor() - getter that returns the object author.
  
Class EBook is inherited by the class Book, and it represents a special type of Book with more specific features like its format and size.

Class PrintCopy, also is inherited by the class Book, and it's another special type of Book that has its features for number of pages and book weight.

Class Author represents the authors of the books, its name, surname and year of birth. It has getter for each variable and toString() function that returns the author's name and surname.

Main class has the answers to all requirements of exercise 1 and 2. Here are its features:

  printBooks() -  Prints all the books in increasing (year) order
  getBooksBySurname() - Prints all the books whose author's last name starts with entered character
  auhtorBooksDecade() - Prints all the books that are written in the authors' decade
  auhtorsThreeBooks() - Prints authors that have more than 3 books
  booksOldestNewest() - Prints the oldest and the newest book added.
  
In the main function, two Lists were made. One of type Book, and one of type Author. List<Book> collects all the books from EBook as well as from PrintBook type (class). Similar, List<Author> collects all authors of the books. As an example, both Lists are filled with informations who can demonstrate that functions mentioned earlier work and are called, ready for compile and run. 

    I used Java version 16
    ----------------------------------
    Here's how to run it from terminal:
      Unzip the downloaded folder
      Open the folder from terminal
      cd problem\src
      javac -cp . com/example/bookLibrary/*.java
      java -cp . com/example/bookLibrary/Main
  
