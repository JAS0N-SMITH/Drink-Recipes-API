package com.drinkrecipes.drinks;

import java.util.List;

import lombok.Data;

@Data
public class Ingredient {
    private Double quantity;
    private UnitOfMeasurement unitOfMeasurement;
    private String name;
    private List<String> recommended;

    public Ingredient(Double quantity, UnitOfMeasurement unitOfMeasurement, String name, List<String> recommended){
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
        this.name = name;
        this.recommended = recommended;
    }
}
