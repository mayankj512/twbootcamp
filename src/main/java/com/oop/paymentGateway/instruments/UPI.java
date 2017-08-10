package com.oop.paymentGateway.instruments;

public class UPI implements IInstrument {
    @Override
    public boolean deductAmount(double amount) {
        return false;
    }
}
