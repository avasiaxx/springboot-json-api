package com.avasia.restservice;

import java.util.List;
import java.util.Objects;

/**
 * Recipe Class
 */
public class Recipe {
    //Recipe name
    public String name;
    //Recipe Ingredients
    public List<String> ingredients;

    //Recipe Instructions
    public List<String> instructions;

    /**
     *
     * @param obj used to search for an existing obj inside the recipes list
     * @return true if the recipe list contains the object if not then false
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Recipe && Objects.equals(((Recipe) obj).name, name);
    }
}
