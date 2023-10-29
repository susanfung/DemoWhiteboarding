package org.samples;

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
}
