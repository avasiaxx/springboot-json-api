package com.avasia.restservice;

import java.util.ArrayList;
import java.util.List;

/**
 * Recipes List Class
 */
public class RecipesList {

    //Recipes List
    public List<Recipe> recipes;

    /**
     * Finds the given recipe with name
     *
     * @param name name of recipe
     * @return recipe or null if not found
     */
    public RecipeDetails findRecipeDetails(String name) {
        for (Recipe r : recipes) {
            if (r.name.equals(name)){
                return new RecipeDetails(r.ingredients);
            }
        }
        return null;
    }

    /**
     * Finds all Recipe names that exist in the recipe list
     * @return a list of recipe names
     */
    public RecipeNamesList findRecipeNames(){
        List<String> recipeNames = new ArrayList<>();
        for (Recipe r : recipes) {
            recipeNames.add(r.name);
        }
        return new RecipeNamesList(recipeNames);
    }

    /**
     *
     * @param recipe to find
     * @return a recipe if found
     */
    public boolean findIfRecipeExists(Recipe recipe){
        return recipes.contains(recipe);
    }

    /**
     * Changes a recipe in the recipes list by index ID
     * @param editedRecipe used to replace an existing recipe
     */
    public void changeRecipe(Recipe editedRecipe){
        int id = recipes.indexOf(editedRecipe);
        recipes.set(id, editedRecipe);
    }
}
