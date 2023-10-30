package org.removerecords.orders;

import org.removerecords.Courier;
import org.removerecords.Customer;
import org.removerecords.Restaurant;

import java.util.Date;

public class Order {
    private int orderId;
    private Restaurant restaurant;
    private OrderStatus status;

    public Order(int orderId, Restaurant restaurant) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.status = OrderStatus.ACTIVE;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return new Customer();
    }

    public void setCustomer(Object instance) {

    }

    public Date getOrderDate() {
        return null;
    }

    public Courier getCourier() {
        return null;
    }
}
