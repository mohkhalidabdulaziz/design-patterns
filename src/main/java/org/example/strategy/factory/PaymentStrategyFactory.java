package org.example.strategy.factory;

import org.example.strategy.PaymentStrategy;
import org.example.strategy.impl.BitcoinPayment;
import org.example.strategy.impl.CreditCardPayment;
import org.example.strategy.impl.PayPalPayment;

public class PaymentStrategyFactory {

    /**
     * Factory method to get a payment strategy based on the provided type.
     *
     * @param type The type of payment strategy to be used (e.g., "CreditCard", "PayPal", "Bitcoin").
     * @return The corresponding payment strategy object, or an IllegalArgumentException if the type is unrecognized.
     */
    public static PaymentStrategy getPaymentStrategy(String type) {
        return switch (type.toUpperCase()) {
            case "CREDITCARD" -> new CreditCardPayment();
            case "PAYPAL" -> new PayPalPayment();
            case "BITCOIN" -> new BitcoinPayment();
            default -> throw new IllegalArgumentException(STR."Unknown payment type: \{type}");
        };
    }


}

