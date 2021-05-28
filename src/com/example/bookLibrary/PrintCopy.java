package com.example.bookLibrary;

public class PrintCopy extends Book {
    private int numberOfPages;
    private int weight;

    public PrintCopy(String name, int ISBN, int year, String type, Author autor, int numberOfPages, int weight) {
        super(name, ISBN, year, type, autor);
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

}
