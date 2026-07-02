package com.library.repository;

public class BookRepository {

    public void save(String bookTitle) {
        System.out.println("BookRepository: Saving book -> " + bookTitle);
    }

    public String findById(int id) {
        System.out.println("BookRepository: Finding book with id -> " + id);
        return "Book #" + id;
    }
}