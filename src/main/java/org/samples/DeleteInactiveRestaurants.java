package org.samples;

public class DeleteInactiveRestaurants {
    private final int daysInactive;
    private final RestaurantRepository restaurantRepository;

    public DeleteInactiveRestaurants(int daysInactive, RestaurantRepository restaurantRepository) {
        this.daysInactive = daysInactive;
        this.restaurantRepository = restaurantRepository;
    }

    public void deleteInactive() {
        restaurantRepository.deleteInactive(daysInactive);
    }
}
