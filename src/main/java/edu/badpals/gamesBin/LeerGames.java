package edu.badpals.gamesBin;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LeerGames {
    public static void main(String[] args) {
        List<Game> personas = new ArrayList<>();

        try (ObjectInputStream lector = new ObjectInputStream(new FileInputStream("src/main/java/edu/badpals/gamesBin/pruebaGames.bin"));) {
            while (true) {
                Object o = lector.readObject();
                if (o instanceof Game) {
                    personas.add((Game) o);
                }
            }

        } catch (EOFException ex) {
            System.out.println("Hemos llegado al final del archivo.");
            for (Game m : personas) {
                System.out.println(m);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        }
    }
}