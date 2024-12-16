package com.epam.jmp.task3;

public class PaymentProcessor {
    public void makePayment(PaymentMethod payment, double amount) {
        if (payment.validatePaymentDetails()) {
            payment.processPayment(amount);
        } else {
            System.out.println("Payment Details are not valid!");
        }
    }
}
