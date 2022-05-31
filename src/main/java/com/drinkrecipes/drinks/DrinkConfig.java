package com.drinkrecipes.drinks;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class DrinkConfig {
    @Bean
    CommandLineRunner commandLineRunner(DrinkRepository repository) {
        return args -> {
            String name = "Mai Tai 2";
			Ingredient rum = new Ingredient(2.0, UnitOfMeasurement.OUNCE, "rum", null);
			Ingredient orgeat = new Ingredient(.75, UnitOfMeasurement.OUNCE, "orgeat", null);
			Ingredient limeJuice = new Ingredient(.75, UnitOfMeasurement.OUNCE, "lime juice", null);
			Ingredient simpleSyrup = new Ingredient(.25, UnitOfMeasurement.OUNCE, "simple syrup", null);
			Ingredient orangeCuracao = new Ingredient(1.0, UnitOfMeasurement.OUNCE, "orange curaçao",
					List.of("Pierre Ferrand Dry Curacao", "Cointreau Triple Sec Orange Liqueur"));

			Drink drink = new Drink(
					name,
					List.of(rum, orgeat, limeJuice, simpleSyrup, orangeCuracao),
					LocalDateTime.now());

			repository.findDrinkByName(name).ifPresentOrElse(x -> {
				System.out.println(x.getName() + " already exists");
			}, () -> {
				System.out.println("Inserting drink " + name);
				repository.insert(drink);
			});
            // repository.saveAll(List.of());
        };
    }
}
