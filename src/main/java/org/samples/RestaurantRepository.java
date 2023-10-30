package org.samples;

import org.samples.orders.Order;
import org.samples.orders.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RestaurantRepository {
    public void deleteInactive(int daysInactive) {
        List<Restaurant> inactiveRestaurants = getInactiveRestaurants(daysInactive);

        for (Restaurant restaurant : inactiveRestaurants) {
            deleteReferences(restaurant);
            updateCouriers(restaurant);
            updateUsersAndOrders(restaurant);
            deleteRestaurant(restaurant);
        }
    }

    private List<Restaurant> getInactiveRestaurants(int daysInactive) {
        List<Restaurant> allRestaurants = RestaurantRepository.getAllRestaurants();
        List<Restaurant> inactiveRestaurants = new ArrayList<>();

        Date currentDate = new Date();

        for (Restaurant restaurant : allRestaurants) {
            Date lastModified = restaurant.getLastModified();

            long timeDifference = currentDate.getTime() - lastModified.getTime();

            long daysDifference = timeDifference / (24 * 60 * 60 * 1000);

            if (daysDifference >= daysInactive) {
                inactiveRestaurants.add(restaurant);
            }
        }

        return inactiveRestaurants;
    }

    private static List<Restaurant> getAllRestaurants() {
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant());
        return restaurants;
    }

    public void deleteReferences(Restaurant restaurant) {
        List<Reference> references = getAllReferences();
        List<Reference> referencesToDelete = new ArrayList<>();

        for (Reference reference : references) {
            if (reference.getRestaurant().equals(restaurant)) {
                referencesToDelete.add(reference);
            }
        }

        for (Reference reference : referencesToDelete) {
            deleteReference(reference);
        }
    }

    private List<Reference> getAllReferences() {
        List<Reference> references = new ArrayList<>();
        return references;
    }

    private void deleteReference(Reference reference) {
        List<Reference> references = getAllReferences();

        references.remove(reference);
    }

    public void updateCouriers(Restaurant restaurant) {
        List<Courier> couriers = getAllCouriers();

        for (Courier courier : couriers) {
            if (courier.getAssociatedRestaurant() != null && courier.getAssociatedRestaurant().equals(restaurant)) {
                courier.setAssociatedRestaurant(null);
            }
        }
    }

    private List<Courier> getAllCouriers() {
        List<Courier> couriers = new ArrayList<>();

        couriers.add(new Courier(1, "Courier 1"));
        couriers.add(new Courier(2, "Courier 2"));
        couriers.add(new Courier(3, "Courier 3"));

        return couriers;
    }

    public void updateUsersAndOrders(Restaurant restaurant) {
        List<User> users = getAllUsers();

        for (User user : users) {
            List<Order> userOrders = user.getOrders();
            for (Order order : userOrders) {
                if (order.getRestaurant().equals(restaurant)) {
                    order.setStatus(OrderStatus.INACTIVE);
                }
            }
        }
    }

    private List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        users.add(new User(1, "User 1"));
        users.add(new User(2, "User 2"));
        users.add(new User(3, "User 3"));

        return users;
    }

    public static void deleteRestaurant(Restaurant restaurant) {
        List<Restaurant> restaurants = RestaurantDB.getAllRestaurantsFromDB();

        if (restaurants.contains(restaurant)) {
            restaurants.remove(restaurant);
        } else {
            new LogMessage("Delete not successful", "warning").outputMessage();
        }
    }
}