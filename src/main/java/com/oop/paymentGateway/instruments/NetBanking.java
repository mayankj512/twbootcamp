package com.oop.paymentGateway.instruments;

public class NetBanking implements IInstrument {
    @Override
    public boolean deductAmount(double amount) {
        return false;
    }
}
