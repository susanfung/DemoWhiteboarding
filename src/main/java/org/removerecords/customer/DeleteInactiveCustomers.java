package org.removerecords.customer;

import org.removerecords.LogMessage;
import org.removerecords.restaurant.RestaurantReview;
import org.removerecords.restaurant.RestaurantReviewDB;
import org.removerecords.courier.CourierReview;
import org.removerecords.courier.CourierReviewDB;
import org.removerecords.orders.Order;
import org.removerecords.orders.OrderDB;

import java.util.List;

public class DeleteInactiveCustomers {

     private List<Customer> customers;
     private List<Order> orders;
     private List<RestaurantReview> restaurantReviews;
    private List<CourierReview> courierReviews;

    public DeleteInactiveCustomers() {
        customers = CustomerDB.getAllCustomersFromDB();
        orders = OrderDB.getAllOrdersFromDB();
        restaurantReviews = RestaurantReviewDB.getAllRestaurantReviewsFromDB();
        courierReviews = CourierReviewDB.getAllCourierReviewsFromDB();
    }

    public void findAndDeleteInactiveCustomers(int daysInactive) {
        for (Customer customer : customers) {
            if (customer.daysSinceLastOrder() > daysInactive) {
                deleteInactiveCustomer(customer);
            }
        }
    }

    private void deleteInactiveCustomer(Customer customer) {
        if (CustomerDB.getReviewingCustomersFromDB().contains(customer)) {
            for (Order order : orders) {
                if (order.getCustomer() == customer) {
                    order.setCustomer(InactiveCustomer.getInstance());
                }
            }

            for (RestaurantReview review : restaurantReviews) {
                if (review.getCustomer() == customer) {
                    review.setCustomer(InactiveCustomer.getInstance());
                }
            }

            for (CourierReview review : courierReviews) {
                if (review.getCustomer() == customer) {
                    review.setCustomer(InactiveCustomer.getInstance());
                }
            }

            CustomerDB.removeCustomerFromDB(customer);
        } else {
            new LogMessage("Delete not successful", "warning").outputMessage();
        }
    }
}

