package com.oop.paymentGateway;

import com.oop.paymentGateway.instruments.*;

public class PaymentGateway {

   IInstrument paymentInstrument;

   public PaymentGateway(PaymentMode mode) {
       setPaymentInstrument(mode);
   }

   private void setPaymentInstrument(PaymentMode mode) {
       switch (mode) {
           case CREDIT_CARD:
               paymentInstrument = new CreditCard();
           case DEBIT_CARD:
               paymentInstrument = new DebitCard();
           case NET_BANKING:
               paymentInstrument = new NetBanking();
           case UPI:
               paymentInstrument = new UPI();
       }
   }

   public boolean pay(double amount){
       paymentInstrument.deductAmount(amount);
       return true;

   }
}
