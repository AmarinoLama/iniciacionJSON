package edu.badpals.pokemon;


import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


// Escribir el fichero xml en un string y convertirlo a JSON

public class XMLtoJSON {

    public void main(String[] args) {
        System.out.println("Dime la ruta del archivo:"); // "C:\Users\a23amanlv\IdeaProjects\iniciacionJSON\src\main\java\edu\badpals\pokemon\pokemon-reducido.xml
        Scanner sc = new Scanner(System.in);
        Path path = Path.of(sc.nextLine());

        String xmlString = readFile(path);
        JSONObject json = XML.toJSONObject(xmlString);
        System.out.println(json.toString(4)); // Deja tabulaciones para darle mejor formato
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

        /*try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta.toString()))) {
            for (String line : palabras) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Archivo ordenado generado: " + ruta);*/
    }

}