package com.epam.jmp.task1;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class LibrarySystem {

    final ConcurrentHashMap<String, Book> bookRegistry = new ConcurrentHashMap<>();

    public void checkOutBook(String bookId, User user) {
        if (bookRegistry.containsKey(bookId)) {
            System.out.println("Book is currently unavailable.");
        } else {
            Book book = Optional.ofNullable(bookRegistry.get(bookId)).orElse(new Book(bookId, "checked out"));
            System.out.println("Book checked out to " + user);
        }
    }

    public void returnBook(String bookId) {
        if (bookRegistry.containsKey(bookId)) {
            Book book = bookRegistry.get(bookId);
            book.setAvailability("Available");
            System.out.println("Book returned.");
        } else {
            System.out.println("This book was not checked out.");
        }
    }
}
