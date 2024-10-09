package edu.badpals.gamesBin;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LeerGames {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();

        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/main/java/edu/badpals/gamesBin/pruebaGames.bin"));) {
            while (true) {
                Object o = lector.readObject();
                if (o instanceof Game) {
                    games.add((Game) o);
                }
            }

        } catch (EOFException ex) {
            System.out.println("Hemos llegado al final del archivo.");
            for (Game m : games) {
                System.out.println(m);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }

        saveGamesJson(games);
    }

    public static void saveGamesJson(List<Game> games) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/edu/badpals/gamesBin/pruebaGames.json"))) {

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(games);
            writer.write(json);

            /*JsonNode node = new XmlMapper().readTree(new File("src/main/java/edu/badpals/gamesBin/pruebaGames.bin"));
            new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/edu/badpals/gamesBin/pruebaGames.json"), node);*/

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Json creado correctamente en src/main/java/edu/badpals/gamesBin/pruebaGames.json");
    }
}