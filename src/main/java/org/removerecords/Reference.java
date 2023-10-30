package org.removerecords;

import org.removerecords.restaurant.Restaurant;

public class Reference {
    private Restaurant restaurant;

    public Reference(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
