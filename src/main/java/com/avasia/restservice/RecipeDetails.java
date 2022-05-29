package com.avasia.restservice;

import java.util.List;

public class RecipeDetails {

    public List<String> ingredients;

    public int numSteps = 0;

    public RecipeDetails(List<String> ingredients) {
        this.ingredients = ingredients;
        numSteps = ingredients.size();
    }
}
