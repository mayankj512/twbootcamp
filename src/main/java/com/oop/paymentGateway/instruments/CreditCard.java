package com.oop.paymentGateway.instruments;

public class CreditCard implements IInstrument {

   String cardNumber;
   String cvv;
   String cardHolderName;
   int expiryMonth;
   int expiryYear;

    public CreditCard(String cardNumber, String cvv, String cardHolderName, int expiryMonth, int expiryYear) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardHolderName = cardHolderName;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }

    public CreditCard() {
    }

    @Override
    public boolean deductAmount(double amount) {
        return false;
    }
}

