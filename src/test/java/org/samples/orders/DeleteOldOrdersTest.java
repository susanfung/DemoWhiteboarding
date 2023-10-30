package org.samples.orders;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;
import org.samples.DeleteInactiveCustomers;

import static org.junit.jupiter.api.Assertions.*;

class DeleteOldOrdersTest {

    @Test
    void deleteAllOldOrders() {
        StringBuffer log = SimpleLogger.logToString();
        DeleteOldOrders.deleteAllOldOrders();
        Approvals.verify(log);
    }
}