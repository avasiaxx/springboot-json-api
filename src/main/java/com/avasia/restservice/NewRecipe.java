package com.avasia.restservice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class NewRecipe {

    public String recipeName;
    List<String> ingredients = new ArrayList<>();
    List<String> instructions = new ArrayList<>();

    public NewRecipe(Recipe recipe){
        this.recipeName = recipe.name;
        this.ingredients = recipe.ingredients;
        this.instructions = recipe.instructions;
    }
}
