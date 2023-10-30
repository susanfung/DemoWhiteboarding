package org.removerecords;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private DeleteInactiveCustomersApi deleteInactiveCustomersApi = new DeleteInactiveCustomersApi();

    @PostMapping("/deleteInactive")
    public void deleteInactiveCustomers() {
        deleteInactiveCustomersApi.deleteInactiveCustomersApi();
    }
}

