package org.example.withoutstrategy;

import org.example.withoutstrategy.config.AppConfig;
import org.example.withoutstrategy.service.EmailService;
import org.example.withoutstrategy.service.SmsService;

public class OrderService {

    private final AppConfig appConfig;
    private final EmailService emailService;
    private final SmsService smsService;

    public OrderService(AppConfig appConfig, EmailService emailService, SmsService smsService) {
        this.appConfig = appConfig;
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void shipOrder(Order order) {

        // Send notification based on type
        String message = STR."Order \{order.getId()} has been shipped.";
        if (appConfig.getNotificationType() == NotificationType.EMAIL) {
            emailService.sendEmail(order.getCustomerEmail(), "Order Shipped", message);
        } else if (appConfig.getNotificationType() == NotificationType.SMS) {
            smsService.sendSms(order.getCustomerPhone(), message);
        } else {
            System.out.println(STR."Unsupported notification type: \{appConfig.getNotificationType()}");
        }
    }


}
