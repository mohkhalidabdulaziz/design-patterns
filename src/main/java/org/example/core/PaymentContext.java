package org.example.core;

import org.example.strategy.PaymentStrategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    /**
     * Sets the payment strategy to be used for processing payments.
     *
     * @param paymentStrategy The payment strategy to be used.
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Processes a payment using the set payment strategy.
     *
     * @param amount The amount to be paid.
     * @throws IllegalStateException If the payment strategy is not set.
     */
    public void pay(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }

}
