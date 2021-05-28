package com.example.bookLibrary;

public class Author {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Author(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return name+" "+surname;
    }
}
