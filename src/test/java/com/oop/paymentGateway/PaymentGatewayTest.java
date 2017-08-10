package com.oop.paymentGateway;

import org.junit.Test;

public class PaymentGatewayTest {

    @Test
    public void testPaymentGateway() {
        new PaymentGateway(PaymentMode.CREDIT_CARD).pay(100);
    }
}
