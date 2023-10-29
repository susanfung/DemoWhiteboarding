package org.samples;

public class Courier {
    private int id;
    private String name;
    private Restaurant associatedRestaurant; // If a courier can be associated with a restaurant

    public Courier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Restaurant getAssociatedRestaurant() {
        return associatedRestaurant;
    }

    public void setAssociatedRestaurant(Restaurant associatedRestaurant) {
        this.associatedRestaurant = associatedRestaurant;
    }
}
