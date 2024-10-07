package edu.badpals.pokemon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class XMLtoJSON {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Path.of("src\\main\\java\\edu\\badpals\\pokemon\\pokemon.json").toFile()))) {

            JsonNode node = new XmlMapper().readTree(Path.of("src\\main\\java\\edu\\badpals\\pokemon\\pokemon-reducido.xml").toFile());
            String jsonString = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(node);
            writer.write(jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}