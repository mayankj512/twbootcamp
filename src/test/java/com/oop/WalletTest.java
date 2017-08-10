package com.oop;

import com.oop.wallet.Wallet;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WalletTest {

    @Test
    public void testAdd() {
        Wallet wallet = new Wallet();
        wallet.put(200);
        assertEquals(200d, wallet.getBalance());
    }

    @Test
    public void testWithdraw() {
        Wallet wallet = new Wallet();
        wallet.put(200);
        wallet.fetch(100);
        assertEquals(true, wallet.fetch(100));

    }

    @Test
    public void testWithdrawWithLessBalance() {
        Wallet wallet = new Wallet();
        wallet.put(200);
        wallet.fetch(100);
        assertEquals(false, wallet.fetch(500));

    }


    @Test
    public void testBalance() {

    }
}
