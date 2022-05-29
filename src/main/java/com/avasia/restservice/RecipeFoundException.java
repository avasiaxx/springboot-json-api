package com.avasia.restservice;

/**
 * Recipe Found Exception Class
 */
public class RecipeFoundException {

    //String Error
    String error;

    /**
     * Accepts a string error then sets it
     * @param t is the string error that gets set to the Recipe Found Exception
     */
    public RecipeFoundException(String t) {
        error = t;
    }

}
