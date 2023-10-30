package org.removerecords;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class DeleteInactiveRestaurantsTest {

    @Test
    void deleteInactive() {
        StringBuffer log = SimpleLogger.logToString();
        new DeleteInactiveRestaurants(100, new RestaurantRepository()).deleteInactive();
        Approvals.verify(log);
    }
}