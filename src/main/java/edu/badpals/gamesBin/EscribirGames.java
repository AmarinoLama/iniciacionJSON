package edu.badpals.gamesBin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

public class EscribirGames {

    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new Game("Mario", "plataformer", "es", Map.of("Miguel", "muy bueno", "Javi", "muy malo")));
        games.add(new Game("Zelda", "adventure", "es, en", Map.of("Pablo", "espectaculas", "Alfonso", "decepcionante")));
        games.add(new Game("TWD", "zombie", "es, en, fr", Map.of("Andres", "me encanto", "Mateo", "lo odio")));

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("src/main/java/edu/badpals/gamesBin/pruebaGames.bin"));) {
            for (Game m : games) {
                escritor.writeObject(m);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
