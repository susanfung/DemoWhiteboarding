package org.removerecords.orders;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class DeleteOldOrdersTest {

    @Test
    void deleteAllOldOrders() {
        StringBuffer log = SimpleLogger.logToString();
        DeleteOldOrders.deleteAllOldOrders();
        Approvals.verify(log);
    }
}