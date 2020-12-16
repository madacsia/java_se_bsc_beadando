package webshop2;

import java.util.ArrayList;
import java.util.List;

public class Raktar {
    public static List<Termek> termekek = new ArrayList<>();

    public static int keszlet(Termek p_termek) {
        int db = 0;
        for (Termek termek : termekek) {
            if (termek.equals(p_termek)) {
                db = db + 1;
            }
        }
        return  db;
    }

    public static void keszletbolTorol(String nev) {
        Termek torlendo = null;
        for (Termek termek : termekek) {
            if (termek.getNev().equals(nev)) {
                torlendo=termek;
               // System.out.println("törlendő :"+torlendo.getNev());
            }
        }
        termekek.remove(torlendo);
    }

}

