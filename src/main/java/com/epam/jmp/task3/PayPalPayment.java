package com.epam.jmp.task3;

class PayPalPayment extends PaymentMethod {
    boolean validatePaymentDetails() {
        // Validate PayPal account
        return true;
    }

    void processPayment(double amount) {
        // Log in to PayPal and process payment
        // instead of throwing UnsupportedOperationException throw custom PaymentProcessingException
    }
}
