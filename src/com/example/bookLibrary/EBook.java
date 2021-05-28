package com.example.bookLibrary;

public class EBook extends Book {
    public enum Format {
        epub,
        pdf,
        html5
    }
    private Format typeOfFormat;
    private int size;

    public EBook(String name, String ISBN, int year, Author author, Format typeOfFormat, int size) {
        super(name, ISBN, year, Type.EBook, author);
        this.typeOfFormat = typeOfFormat;
        this.size = size;
    }


}
