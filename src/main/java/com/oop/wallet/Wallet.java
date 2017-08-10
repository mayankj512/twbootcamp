package com.oop.wallet;

public class Wallet {

    private double balance;


    public Wallet() {
        this.balance = 0;
    }

    public boolean put(double amount) {
        balance += amount;
        return true;
    }

    public boolean fetch(double amount) {
        if(balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

}
