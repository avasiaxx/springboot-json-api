package com.avasia.restservice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * New Recipe Class
 */
public class NewRecipe {

    //New Recipe Name
    public String recipeName;

    //New Recipe Ingredients
    ArrayList<String> ingredients;

    //New Recipe Instructions
    ArrayList<String> instructions;

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
