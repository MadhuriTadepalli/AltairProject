package com.altair;
import java.io.FileWriter;
import java.io.IOException;

public class DayThreeCreateAFile {

    public static void main(String[] args) {
        String data = "Altair Technologies";
        String filePath = "C:/Users/mtadepalli/IdeaProjects/AltairProject/src/com/AltairTechnologies.txt"; // Change path as needed
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(data);
            writer.close();
            System.out.println("File created successfully at: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}

