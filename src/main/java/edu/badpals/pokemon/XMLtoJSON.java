package edu.badpals.pokemon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class XMLtoJSON {

    public static void main(String[] args) {

        try {
            JsonNode node = new XmlMapper().readTree(new File("src/main/java/edu/badpals/pokemon/pokemon-reducido.xml"));
            new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/edu/badpals/pokemon/pokemon.json"), node);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}