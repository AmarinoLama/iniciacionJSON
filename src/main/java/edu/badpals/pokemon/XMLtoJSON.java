package edu.badpals.pokemon;

import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class XMLtoJSON {

    public void main(String[] args) {
        System.out.println("Dime la ruta del archivo:"); // "C:\Users\a23amanlv\IdeaProjects\iniciacionJSON\src\main\java\edu\badpals\pokemon\pokemon-reducido.xml"
        Scanner sc = new Scanner(System.in);
        Path path = Path.of(sc.nextLine());

        String xmlString = readFile(path);
        JSONObject json = XML.toJSONObject(xmlString);

        System.out.println("Dime donde quieres guardar el json:");
        writeJSON(json.toString(4), Path.of(sc.nextLine() + "/pokemon.json")); // Deja tabulaciones para darle mejor formato
    }

    public String readFile(Path path) {
        StringBuilder xmlString = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new
                FileReader(path.toFile()));) {
            String linea;
            while ((linea = lector.readLine()) != null)
                xmlString.append(linea);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return xmlString.toString();
    }

    public void writeJSON(String json, Path path) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()))) {
            writer.write(json);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Archivo ordenado generado: " + path);
    }

}