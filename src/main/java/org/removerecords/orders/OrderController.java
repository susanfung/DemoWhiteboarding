package org.removerecords.orders;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private DeleteOldOrdersApi deleteOldOrdersApi = new DeleteOldOrdersApi();

    @PostMapping("/deleteOldOrders")
    public void deleteInactiveOrders() {
        deleteOldOrdersApi.deleteOldOrdersApi();
    }
}

