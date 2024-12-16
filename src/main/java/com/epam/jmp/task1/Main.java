package com.epam.jmp.task1;

public class Main {

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();
        Book book1 = new Book("BK001", "Available");
        User user1 = new User("USR001", book1);
        library.checkOutBook("BK001", user1);
        library.returnBook("BK001");
        user1.reserveBook();
    }
}