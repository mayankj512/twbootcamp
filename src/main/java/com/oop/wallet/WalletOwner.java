package com.oop.wallet;

public class WalletOwner {

    private Wallet wallet;

    public WalletOwner() {
        this.wallet = new Wallet();
    }

    public boolean addMoneyInWallet(double amount){
         return wallet.put(amount);
    }

    public boolean payMoneyFromWallet(double amount) {
        return wallet.fetch(amount);
    }
}
