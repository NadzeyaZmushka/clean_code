package com.epam.jmp.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibrarySystemTest {
    private LibrarySystem library;
    private User testUser;
    private Book testBook;

    @BeforeEach
    public void setUp() {
        library = new LibrarySystem();
        testUser = new User("testUser", new Book("Book1", "Available"));
        testBook = new Book("Book1", "checked out");
        library.bookRegistry.put("Book1", testBook); //initialize a book in the library
    }

    @Test
    public void testCheckOutBook_success() {
        library.checkOutBook("Book1", testUser);
        assertEquals("checked out", testBook.getAvailability());
    }

    @Test
    public void testCheckOutBook_fail() {
        testBook.setAvailability("checked out"); //make the book unavailable
        library.checkOutBook("Book1", testUser);
        assertEquals("checked out", testBook.getAvailability());
    }

    @Test
    public void testReturnBook_success() {
        testBook.setAvailability("checked out"); //make the book unavailable first
        library.returnBook("Book1");
        assertEquals("Available", testBook.getAvailability());
    }

    @Test
    public void testReturnBook_fail() {
        library.bookRegistry.remove("Book1"); //remove the book from the library
        library.returnBook("Book1");
        assertNull(library.bookRegistry.get("Book1"));
    }
}