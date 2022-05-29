package com.avasia.restservice;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.nio.file.Files;

public class FileHandler {

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
