package com.oop;

import com.oop.wallet.WalletOwner;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WalletOwnerTest {

    @Test
    public void testAddMoney () {
        WalletOwner owner = new WalletOwner();
        assertTrue(owner.addMoneyInWallet(200));
    }


    @Test
    public void testPayMoney () {
        WalletOwner owner = new WalletOwner();
        assertFalse(owner.payMoneyFromWallet(200));
        assertTrue(owner.addMoneyInWallet(200));
        assertTrue(owner.payMoneyFromWallet(200));
    }
}
