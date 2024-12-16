package com.epam.jmp.task3;

abstract class PaymentMethod {
    abstract boolean validatePaymentDetails();

    abstract void processPayment(double amount);
}
