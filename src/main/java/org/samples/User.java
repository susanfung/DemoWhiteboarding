package org.samples;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Order> orders;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }
}
