package com.avasia.restservice;

import java.util.List;

/**
 * Recipe Details Class
 */
public class RecipeDetails {

    //List of Recipe Details
    public List<String> ingredients;

    //List of Recipe Instructions
    public List<String> instructions;

    //Number of steps required in the recipe instructions
    public int numSteps;

    /**
     * Gets the recipe details then sets the ingredients/instructions then calculates the amount of instructions
     * it takes to make the recipe
     * @param ingredients is the recipe ingredients
     * @param instructions is the recipe instructions
     */
    public RecipeDetails(List<String> ingredients, List<String> instructions) {
        this.ingredients = ingredients;
        this.instructions = instructions;
        numSteps = instructions.size();
    }
}
