package org.example.strategy.impl;

import org.example.strategy.PaymentStrategy;

public class BitcoinPayment implements PaymentStrategy {
    /**
     * Processes a payment of a specified amount using Bitcoin.
     *
     * @param amount The payment amount to be processed. This value should be a positive, non-zero double.
     */
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }
}