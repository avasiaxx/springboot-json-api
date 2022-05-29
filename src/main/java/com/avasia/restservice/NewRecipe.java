package com.avasia.restservice;

import java.util.ArrayList;
import java.util.List;

/**
 * New Recipe Class
 */
public class NewRecipe {

    //New Recipe Name
    public String recipeName;

    //New Recipe Ingredients
    List<String> ingredients;

    //New Recipe Instructions
    List<String> instructions;

    /**
     * Gets the new recipe through the constructor then sets all of it's variables
     * @param recipe is the new recipe passed to the constructor
     */
    public NewRecipe(Recipe recipe){
        this.recipeName = recipe.name;
        this.ingredients = recipe.ingredients;
        this.instructions = recipe.instructions;
    }
}
