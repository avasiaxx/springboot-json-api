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

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Recipe && Objects.equals(((Recipe) obj).name, name);
    }
}
