package ru.gb.hw1.model;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public void save(String path,String message){

        try (FileWriter writer = new FileWriter(path, true)) {
            writer.write(message);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
