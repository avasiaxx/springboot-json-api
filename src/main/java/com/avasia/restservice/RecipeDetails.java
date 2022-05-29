package com.avasia.restservice;

import java.util.List;

/**
 * Recipe Details Class
 */
public class RecipeDetails {

    //List of Recipe Details
    public List<String> ingredients;

    //Number of steps required in the recipe instructions
    public int numSteps;

    /**
     * Sets the ingredients taken in from the constructor then calculates the amount of steps it takes to make
     * the recipe
     * @param ingredients is the recipe ingredients
     */
    public RecipeDetails(List<String> ingredients) {
        this.ingredients = ingredients;
        numSteps = ingredients.size();
    }
}
