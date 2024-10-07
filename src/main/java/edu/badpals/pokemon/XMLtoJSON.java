package edu.badpals.pokemon;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class XMLtoJSON {

    public void main(String[] args) {
        System.out.println("Dime la ruta del archivo:"); // "C:\Users\a23amanlv\IdeaProjects\iniciacionJSON\src\main\java\edu\badpals\pokemon\pokemon-reducido.xml"
        Scanner sc = new Scanner(System.in);
        Path path = Path.of(sc.nextLine());

        ObjectMapper mapper = new ObjectMapper();
        try {
            String xmlString = new String(java.nio.file.Files.readAllBytes(path));

            XmlMapper xmlMapper = new XmlMapper();
            JsonNode node = xmlMapper.readTree(xmlString.getBytes());
            ObjectMapper jsonMapper = new ObjectMapper();
            String jsonString = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);

            System.out.println("Dime donde quieres guardar el json:");
            BufferedWriter writer = new BufferedWriter(new FileWriter(Path.of(sc.nextLine()).resolve("pokemon.json").toString()));
            writer.write(jsonString);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}