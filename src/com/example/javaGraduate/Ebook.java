package com.example.javaGraduate;

public class Ebook extends Book{
    private String typeOfFormat;
    private int size;

    public Ebook(String name, int ISBN, int year, String type, Author autor, String typeOfFormat, int size) {
        super(name, ISBN, year, type, autor);
        this.typeOfFormat = typeOfFormat;
        this.size = size;
    }


}
