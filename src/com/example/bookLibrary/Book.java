package com.example.bookLibrary;

public class Book {
    private String title;
    private String ISBN;
    private int year;
    protected enum Type {
        EBook,
        PrintCopy
    }
    private Type type;
    private Author author;

    public Book(String title, String ISBN, int year, Type type, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.year = year;
        this.type=type;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " - " + author.getName() + " " + author.getSurname() + " - " + year;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }
}
