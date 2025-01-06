package org.example.withoutstrategy.config;

import org.example.withoutstrategy.NotificationType;

public class AppConfig {

    private final String shippingServiceUrl;
    private final NotificationType notificationType;

    public AppConfig(String shippingServiceUrl, NotificationType notificationType) {
        this.shippingServiceUrl = shippingServiceUrl;
        this.notificationType = notificationType;
    }

    public String getShippingServiceUrl() {
        return shippingServiceUrl;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }
}
