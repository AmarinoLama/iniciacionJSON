package edu.badpals.gamesBin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscribirGames {

    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new Game("Mario", "plataformer", "es"));
        games.add(new Game("Zelda", "adventure", "es, en"));
        games.add(new Game("TWD", "zombie", "es, en, fr"));

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("src/main/java/edu/badpals/gamesBin/pruebaGames.bin"));) {
            for (Game m : games) {
                escritor.writeObject(m);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
