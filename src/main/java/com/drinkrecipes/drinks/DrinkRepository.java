package com.drinkrecipes.drinks;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DrinkRepository extends MongoRepository<Drink, String> {
    Optional<Drink> findDrinkByName(String name);
    @Query("SELECT s FROM Drink s WHERE s.ingredient = ?1")
    Optional<Drink> findDrinkByIngredient(String ingredient);
}
