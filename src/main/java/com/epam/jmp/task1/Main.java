package com.epam.jmp.task1;

public class Main {

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Book book1 = new Book("Book 1", "Available");
        User user1 = new User("User 1", book1);
        library.checkOutBook("Book 1", user1);
        library.returnBook("Book 1");
        user1.reserveBook();
    }
}