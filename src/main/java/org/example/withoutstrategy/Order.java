package org.example.withoutstrategy;

public class Order {


    private String CustomerEmail;
    private String CustomerPhone;
    private String status;
    private String shipedAt;
    private int Id;


    public Order(int id, String customerEmail, String customerPhone, String status) {
        CustomerEmail = customerEmail;
        CustomerPhone = customerPhone;
        this.status = status;
        this.shipedAt = shipedAt;
        this.Id = id;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipedAt() {
        return shipedAt;
    }

    public void setShipedAt(String shipedAt) {
        this.shipedAt = shipedAt;
    }



}
