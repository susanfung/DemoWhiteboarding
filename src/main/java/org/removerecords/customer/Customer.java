package org.removerecords.customer;

import org.removerecords.orders.Order;

import java.util.List;

public class Customer {

    public int daysSinceLastOrder() {
        return 365;
    }

    public List<Order> getOrderHistory() {
        return null;
    }

    public List<CustomerReview> getCustomerReviews() throws Exception {
        throw new Exception("Not implemented");
    }
}
