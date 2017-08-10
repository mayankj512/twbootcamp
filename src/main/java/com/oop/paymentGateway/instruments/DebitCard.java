package com.oop.paymentGateway.instruments;

public class DebitCard implements IInstrument {

    String cardNumber;
    String cvv;
    String cardHolderName;
    int expiryMonth;
    int expiryYear;

    public DebitCard() {
    }

    public DebitCard(String cardNumber, String cvv, String cardHolderName, int expiryMonth, int expiryYear) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }


    @Override
    public boolean deductAmount(double amount) {
        return false;
    }
}

