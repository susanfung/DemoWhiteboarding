package org.removerecords.orders;

import org.removerecords.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class OrderDB {
    public static List<Order> getAllOrdersFromDB() {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1, new Restaurant()));
        return orders;
    }
}
