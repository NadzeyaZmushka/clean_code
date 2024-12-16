package com.epam.jmp.task1;

class User implements Observer {
    private final String userID;
    private final Book book;

    User(String userID, Book book) {
        this.userID = userID;
        this.book = book;
        book.registerObserver(this);
    }

    public void update(String availability) {
        System.out.println("User: " + this.userID + " received notification. Available: " + availability);
    }

    public void reserveBook() {
        this.book.setAvailability("reserved");
    }
}

