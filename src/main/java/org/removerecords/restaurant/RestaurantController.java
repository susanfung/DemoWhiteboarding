package org.removerecords.restaurant;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private DeleteInactiveRestaurantsApi deleteInactiveRestaurantsApi = new DeleteInactiveRestaurantsApi();

    @PostMapping("/deleteInactive")
    public void deleteInactiveRestaurants() {
        deleteInactiveRestaurantsApi.deleteInactiveRestaurantsApi();
    }
}

