package org.removerecords;

import org.removerecords.orders.Order;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

public class Restaurant {
    public Date getLastModified() {
        LocalDate currentDate = LocalDate.now();

        LocalDate oneYearAgo = currentDate.minusYears(1);

        Date oneYearAgoDate = Date.from(oneYearAgo.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return oneYearAgoDate;
    }

    public List<Order> getOrderHistory() {
        return null;
    }

    public List<RestaurantReview> getRestaurantReviews() {
        return null;
    }
}
