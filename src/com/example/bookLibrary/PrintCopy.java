package com.example.bookLibrary;

public class PrintCopy extends Book {
    private int numberOfPages;
    private double weight;

    public PrintCopy(String name, String ISBN, int year, Author author, int numberOfPages, double weight) {
        super(name, ISBN, year, Type.PrintCopy, author);
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

}
