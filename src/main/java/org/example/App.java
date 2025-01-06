package org.example;

import org.example.withoutstrategy.NotificationType;
import org.example.withoutstrategy.Order;
import org.example.withoutstrategy.OrderService;
import org.example.withoutstrategy.config.AppConfig;
import org.example.withoutstrategy.service.EmailService;
import org.example.withoutstrategy.service.SmsService;

public class App 
{
    public static void main( String[] args )
    {
        // Without Strategy Pattern

        AppConfig appConfig = new AppConfig("http://shipping-service.com", NotificationType.EMAIL);
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();

        // Create OrderService instance
        OrderService orderService = new OrderService(appConfig, emailService, smsService);
        Order order = new Order(100, "abc@gmail.com", "shipped",java.time.Instant.now().toString());

        // Ship the order and notify
        orderService.shipOrder(order);
    }

}
