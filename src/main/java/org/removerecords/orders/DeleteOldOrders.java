package org.removerecords.orders;

import org.removerecords.LogMessage;

import java.util.Date;

public class DeleteOldOrders {

    public static void deleteAllOldOrders() {
        Date currentDate = new Date();
        Date sevenYearsAgo = new Date(currentDate.getTime() - (7 * 365 * 24 * 60 * 60 * 1000L));

        try {
            for (Order order : OrderDB.getAllOrdersFromDB()) {
                if (order.getOrderDate().before(sevenYearsAgo)) {
                    order.getCustomer().getOrderHistory().remove(order);
                    order.getRestaurant().getOrderHistory().remove(order);
                    order.getCourier().getOrderHistory().remove(order);

                    order.getCustomer().getCustomerReviews().remove(order);
                    order.getRestaurant().getRestaurantReviews().remove(order);
                    order.getCourier().getCourierReviews().remove(order);
                }
            }
        } catch (Exception e) {
            new LogMessage("Delete not successful", "warning").outputMessage();
        }
    }
}

