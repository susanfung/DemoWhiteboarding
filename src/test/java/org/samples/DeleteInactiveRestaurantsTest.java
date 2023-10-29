package org.samples;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteInactiveRestaurantsTest {

    @Test
    void deleteInactive() {
        StringBuffer log = SimpleLogger.logToString();
        new DeleteInactiveRestaurants(100, new RestaurantRepository()).deleteInactive();
        Approvals.verify(log);
    }
}