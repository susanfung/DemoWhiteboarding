package org.removerecords.restaurant;

public class DeleteInactiveRestaurantsApi {
    public void deleteInactiveRestaurantsApi() {
        DeleteInactiveRestaurants deleteInactiveRestaurants = new DeleteInactiveRestaurants(100, new RestaurantRepository());
        deleteInactiveRestaurants.deleteInactiveRestaurants();
    }
}
