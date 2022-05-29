package com.avasia.restservice;

import java.util.List;

/**
 * Recipe Names List Class
 */
public class RecipeNamesList {

    //List of Recipe Names
    public List<String> recipeNames;

    /**
     * Gets the recipe names and sets them
     * @param recipeNames is the recipe names that get passed through the constructor and set
     */
    public RecipeNamesList(List<String> recipeNames){
        this.recipeNames = recipeNames;
    }
}
