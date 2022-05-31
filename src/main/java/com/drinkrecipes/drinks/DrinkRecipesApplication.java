package com.drinkrecipes.drinks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DrinkRecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrinkRecipesApplication.class, args);
		
	}

	// @Bean
	// CommandLineRunner runner(DrinkRepository repository, MongoTemplate mongoTemplate) {
	// 	return args -> {

	// 		String name = "Mai Tai 2";
	// 		Ingredient rum = new Ingredient(2.0, UnitOfMeasurement.OUNCE, "rum", null);
	// 		Ingredient orgeat = new Ingredient(.75, UnitOfMeasurement.OUNCE, "orgeat", null);
	// 		Ingredient limeJuice = new Ingredient(.75, UnitOfMeasurement.OUNCE, "lime juice", null);
	// 		Ingredient simpleSyrup = new Ingredient(.25, UnitOfMeasurement.OUNCE, "simple syrup", null);
	// 		Ingredient orangeCuracao = new Ingredient(1.0, UnitOfMeasurement.OUNCE, "orange curaçao",
	// 				List.of("Pierre Ferrand Dry Curacao", "Cointreau Triple Sec Orange Liqueur"));

	// 		Drink drink = new Drink(
	// 				name,
	// 				List.of(rum, orgeat, limeJuice, simpleSyrup, orangeCuracao),
	// 				LocalDateTime.now());

	// 		repository.findDrinkByName(name).ifPresentOrElse(x -> {
	// 			System.out.println(x.getName() + " already exists");
	// 		}, () -> {
	// 			System.out.println("Inserting drink " + name);
	// 			repository.insert(drink);
	// 		});
	// 	};
	// }
}
