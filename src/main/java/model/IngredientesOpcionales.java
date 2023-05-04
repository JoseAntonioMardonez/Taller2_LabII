package model;

public enum IngredientesOpcionales {
    LECHE("Leche"),
    CREMA("Crema"),
    CHOCOLATE("Chocolate");

    private String ingredientesOpcionales;

    private IngredientesOpcionales(String ingredientesOpcionales) {
        this.ingredientesOpcionales = ingredientesOpcionales;
    }

    public String getIngredientesOpcionales() {
        return ingredientesOpcionales;
    }
}
