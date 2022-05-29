package com.avasia.restservice;

/**
 * Recipe Details Response Class
 */
public class RecipeDetailsResponse {

    //Recipe Details
    public RecipeDetails details;

    /**
     * Gets the recipe details through the constructor then sets them
     * @param details is the recipe details passed through the constructor
     */
    public RecipeDetailsResponse(RecipeDetails details){
        this.details = details;
    }
}
