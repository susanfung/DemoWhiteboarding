package org.removerecords;

public class DeleteInactiveCustomersApi {
    public void deleteInactiveCustomersApi() {
        DeleteInactiveCustomers deleteInactiveCustomers = new DeleteInactiveCustomers();
        deleteInactiveCustomers.findAndDeleteInactiveCustomers(100);
    }
}
