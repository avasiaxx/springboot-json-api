package com.avasia.restservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.*;

/**
 * Serves recipes
 */
@RestController
public class RecipesController {

    //List of all recipes
    private final RecipesList recipesList;

    private final Gson gson;

    /**
     * Loads recipes
     */
    public RecipesController() {
        gson = new GsonBuilder().create();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("recipes.json"));
            recipesList = gson.fromJson(reader, RecipesList.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("recipes.json missing");
        }
    }

    /**
     * Gets a specific recipe
     *
     * @return the found recipe or null
     */
    @GetMapping("/recipes")
    public RecipeNamesList recipes() {
        return recipesList.findRecipeNames();
    }

    /**
     *
     * @return Found recipe
     */
    @GetMapping("/recipes/details/{recipeName}")
    public RecipeDetailsResponse getRecipe (@PathVariable("recipeName") String recipeName){
        return new RecipeDetailsResponse(recipesList.findRecipeDetails(recipeName));
    }

    /**
     *
     * @return return either a confirmation of HTTPStatus if the recipe has been created
     * or if it already exists
     */
    @PostMapping("/recipes")
    public ResponseEntity<String> createRecipe(@RequestBody Recipe newRecipe){
        if(!recipesList.findIfRecipeExists(newRecipe)){
            recipesList.recipes.add(newRecipe);
            String json = gson.toJson(recipesList);
            FileHandler.writeRecipesToFile(json);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .build();
        }
        RecipeFoundException exception = new RecipeFoundException("Recipe already exists");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(gson.toJson(exception));
    }

    /**
     *
     * @param editedRecipe contains the submitted recipe
     * @return return either an HTTP.NO_CONTENT status once the recipe is found and replaced or returns HttpStatus.NOT_FOUND
     * if a recipe does not exist
     */
    @PutMapping("/recipes")
    public ResponseEntity<String> editRecipe(@RequestBody Recipe editedRecipe){
        if(recipesList.findIfRecipeExists(editedRecipe)) {
            recipesList.changeRecipe(editedRecipe);
            String json = gson.toJson(recipesList.recipes);
            FileHandler.writeRecipesToFile(json);
            return ResponseEntity.status(HttpStatus.NO_CONTENT)
                    .build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .build();
    }
}



