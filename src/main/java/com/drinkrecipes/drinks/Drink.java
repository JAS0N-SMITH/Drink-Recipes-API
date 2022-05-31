package com.drinkrecipes.drinks;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Drink {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    private List<Ingredient> ingredients;
    private LocalDateTime created;

    public Drink(String name, List<Ingredient> ingredients, LocalDateTime created) {
        this.name = name;
        this.ingredients = ingredients;
        this.created = created;
    }
}
