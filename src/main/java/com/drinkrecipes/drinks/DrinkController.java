package com.drinkrecipes.drinks;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/drinks")
public class DrinkController {

    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping
    public List<Drink> fetchAllDrinks() {
        return drinkService.getAllDrinks();
    }

    @PostMapping
    public void addNewDrink(@RequestBody Drink drink) {
        drinkService.addNewDrink(drink);
    }

    @DeleteMapping(path = "{drinkId}")
    public void deleteDrink(@PathVariable("drinkId") String drinkId) {
        drinkService.deleteDrink(drinkId);
    }

    @GetMapping("/hello")
    public List<String> hello() {
        return List.of("Hello", "World");
    }
}
