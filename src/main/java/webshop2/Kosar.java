package webshop2;

import java.util.ArrayList;
import java.util.List;

public class Kosar {
    public List<Termek> termekek = new ArrayList<>();

    public void hozzaadTermek(Termek termek) {
        termekek.add(termek);
        if (darabszam(termek) > Raktar.keszlet(termek)){
            throw new HibaKezeles(Tipusok.Hibak.KESZLET_TULLEPES);
        }else{
            Raktar.keszletbolTorol(termek.getNev());
        }
    }

    public void kosarbaTermekDb(Termek termek, int p_db) {
        if (p_db > Raktar.keszlet(termek)){
            throw new HibaKezeles(Tipusok.Hibak.KESZLET_TULLEPES);
        }else{
            for (int i = 0; i < p_db; i++) {
                termekek.add(termek);
                Raktar.keszletbolTorol(termek.getNev());
            }
        }
    }

    public void kosarbolTermekTorol(Termek p_termek) {
        int toroltDb;
        Termek torlendo = null;
        toroltDb = darabszam(p_termek);
        for(int i = 0; i < toroltDb; i++){
            for (Termek termek : termekek){
                if (termek.getNev().equals(p_termek.getNev())){
                    torlendo=termek;
                }
            }
            termekek.remove(torlendo);
            Raktar.termekek.add(torlendo);
        }

    }

    public int darabszam(Termek p_termek){
        int db=0;
        for (Termek termek : termekek){
            if (termek.equals(p_termek)){
                db = db+1;
            }
        }
        return  db;
    }


    public List<Termek> getTermekek() {
        return termekek;
    }
}
