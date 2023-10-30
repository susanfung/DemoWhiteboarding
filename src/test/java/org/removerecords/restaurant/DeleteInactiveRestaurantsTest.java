package org.removerecords.restaurant;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import org.removerecords.restaurant.DeleteInactiveRestaurants;
import org.removerecords.restaurant.RestaurantRepository;

class DeleteInactiveRestaurantsTest {

    @Test
    void deleteInactive() {
        StringBuffer log = SimpleLogger.logToString();
        new DeleteInactiveRestaurants(100, new RestaurantRepository()).deleteInactive();
        Approvals.verify(log);
    }
}