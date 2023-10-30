package org.removerecords;

import java.util.ArrayList;
import java.util.List;

public class CourierReviewDB {
    public static List<CourierReview> getAllCourierReviewsFromDB() {
        ArrayList<CourierReview> courierReviews = new ArrayList<>();
        courierReviews.add(new CourierReview());
        return courierReviews;
    }
}
