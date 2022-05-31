package com.drinkrecipes.drinks;

public enum UnitOfMeasurement {
    OUNCE ("Ox"),
    PINT ("Pt"),
    LITER ("lt"),
    MILLILITER ("mL");

    private final String value;

    private UnitOfMeasurement(final String value) {
        this.value = value;
    }

    public String getValue() { return value; }
}