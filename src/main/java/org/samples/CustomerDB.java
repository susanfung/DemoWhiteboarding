package org.samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerDB {
    public static List<Customer> getAllCustomersFromDB() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        return customers;
    }

    public static void removeCustomerFromDB(Customer customer) {
    }

    public static List<Customer> getReviewingCustomersFromDB() {
        return new ArrayList<>();
    }
}
