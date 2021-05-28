package com.example.javaGraduate;

public class Book {
    private String title;
    private long ISBN;
    private int year;
    private String type;
    private Author author;

    public Book(String title, long ISBN, int year, String type, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.year = year;
        this.type = type;
        this.author = author;
    }

    @Override
    public String toString() {
        return title +" - "+ author.getName()+" "+ author.getSurname()+" - "+year;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }
}
