package com.drinkrecipes.drinks;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DrinkService {

    private final DrinkRepository drinkRepository;

    public List<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }    

    public void addNewDrink(Drink drink) {
        Optional<Drink> drinkOptional = drinkRepository.findDrinkByName(drink.getName());
        if (drinkOptional.isPresent()) {
            throw new IllegalStateException("name taken");
        }

        drinkRepository.save(drink);
    }

    public void deleteDrink(String drinkId) {
        boolean exists = drinkRepository.existsById(drinkId);
        if (!exists) {
            throw new IllegalStateException("drink with id " + drinkId + " does not exist");
        }
        drinkRepository.deleteById(drinkId);
    }

}
