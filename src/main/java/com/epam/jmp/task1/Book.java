package com.epam.jmp.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Book implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String bookId;
    private String availability;

    Book(String bookId, String availability){
        this.bookId = bookId;
        this.availability = availability;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.availability);
        }
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }


}
