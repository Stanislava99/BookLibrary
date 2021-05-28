package com.example.bookLibrary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        System.out.println("Enter first letter of your author's last name: ");
        char c=input.next().charAt(0);
        authors.add(0,new Author("Sigmund","Freud",1856));
        authors.add(1,new Author("Immanuel","Kant",1724));
        authors.add(2,new Author("Hermann","Hesse",1877));
        authors.add(3,new Author("Dan","Brown",1964));
        authors.add(4,new Author("Wilson","Harris",1921));

        books.add(0,new Book("The Interpretation of Dreams",48659525,1899,"EBook", authors.get(0)));
        books.add(1,new Book("Beyond The Pleasure Principle",54851397,1920,"EBook", authors.get(0)));
        books.add(2,new Book("Dream Psychology",54985732,1921,"PrintCopy", authors.get(0)));
        books.add(3,new Book("A General Introduction to Psychoanalysis",25483315,1917,"EBook", authors.get(0)));

        books.add(4,new Book("Critique of Pure Reason",78912435,1781,"PrintCopy", authors.get(1)));

        books.add(5,new Book("Steppenwolf",16485975,1927,"PrintCopy", authors.get(2)));

        books.add(6,new Book("Da Vinci Code",49315785,2003,"EBook", authors.get(3)));
        books.add(0,new Book("Angels and Demons",96584732,2000,"EBook", authors.get(3)));

        printBooks(books);
        System.out.println("----------------------");
        getBooksBySurname(c,books);
        System.out.println("----------------------");
        authorBooksDecade(authors.get(4),books);
        System.out.println("----------------------");
        authorsThreeBooks(authors,books);
        System.out.println("----------------------");
        booksOldestNewest(books);
    }
//Prints all the books in increasing (year) order
    public static void printBooks (List<Book> books){
        books.sort(Comparator.comparing(Book::getYear));
        System.out.println("Books: ");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }
//Prints all books whose author's last name starts with entered character
    public static void getBooksBySurname(char a,List<Book> books){
        char c = Character.toUpperCase(a);
        int flag=-1;
        for (Book book : books){
            if(book.getAuthor().getSurname().charAt(0) == c) {
                System.out.println(book.toString());
                flag++;
            }
        }
        if (flag==-1){
            System.out.println("There are no authors with surname starting with '"+c+"'");
        }
    }
// Prints all books that are written in the authors' decade
    public static void authorBooksDecade (Author author, List<Book> books){
        int authorBirthYear = author.getYearOfBirth();
        int decade = authorBirthYear/10;
        int startOfDecade = decade*10;
        int endOfDecade = startOfDecade+9;

        System.out.println("All books from "+startOfDecade+" - "+endOfDecade);
        for(Book book : books ){
            if (book.getYear()>= startOfDecade && book.getYear()<= endOfDecade){
                System.out.println( book.toString());
            }
        }
    }
// Prints authors that have more than 3 books
    public static void authorsThreeBooks(List<Author> authors, List<Book> books){
        for(Author author:authors){
            int count=0;
            for (Book book:books){
                if (book.getAuthor().equals(author))
                    count++;
            }
            if (count>3){
                System.out.println("Authors with more than 3 books: ");
                System.out.print(author);
            }
        }
    }

    public static void booksOldestNewest (List<Book> books ){
        books.sort(Comparator.comparing(Book::getYear));
        System.out.println("Oldest book: ");
        System.out.println(books.get(0).toString());
        System.out.println("Newest book: ");
        System.out.println(books.get(books.size()-1).toString());
    }
}
