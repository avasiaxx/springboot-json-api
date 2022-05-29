package com.avasia.restservice;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * File Handler Class
 */
public class FileHandler {

    /**
     * Makes sure that recipes.json exists in the WD and if it doesn't create the file
     */
    public static void ensureRecipesExists() {
        File recipes = new File("recipes.json");
        if (recipes.exists()) return;
        try {
            InputStream stream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("recipes.json");
            if (stream != null) {
                Files.copy(stream, recipes.toPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes the recipes.json file to WD
     * @param json used to create the json file to disk
     */
    public static void writeRecipesToFile(String json){
        try {
            FileWriter fw = new FileWriter("recipes.json");
            fw.write(json);
            fw.flush();
            fw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
