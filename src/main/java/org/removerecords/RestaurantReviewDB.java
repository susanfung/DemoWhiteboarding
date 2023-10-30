package org.removerecords;

import java.util.ArrayList;
import java.util.List;

public class RestaurantReviewDB {
    public static List<RestaurantReview> getAllRestaurantReviewsFromDB() {
        ArrayList<RestaurantReview> restaurantReviews = new ArrayList<>();
        restaurantReviews.add(new RestaurantReview());
        return restaurantReviews;
    }
}
