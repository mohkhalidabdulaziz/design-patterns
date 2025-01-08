package org.example;

import org.example.core.PaymentContext;
import org.example.strategy.PaymentStrategy;
import org.example.strategy.factory.PaymentStrategyFactory;


public class App 
{
    /**
     * Create a new PaymentContext, which holds the selected PaymentStrategy and
     * provides the pay method to initiate payment.
     */
    public static void main( String[] args )
    {
        PaymentContext context = new PaymentContext();

        // Use Factory to get the appropriate Strategy
        PaymentStrategy strategy1 = PaymentStrategyFactory.getPaymentStrategy("CREDITCARD");
        context.setPaymentStrategy(strategy1);
        context.pay(100);

        PaymentStrategy strategy2 = PaymentStrategyFactory.getPaymentStrategy("PAYPAL");
        context.setPaymentStrategy(strategy2);
        context.pay(200);

        PaymentStrategy strategy3 = PaymentStrategyFactory.getPaymentStrategy("BITCOIN");
        context.setPaymentStrategy(strategy3);
        context.pay(300);
    }

}
