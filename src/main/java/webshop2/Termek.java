package webshop2;

public class Termek {
    private String nev;
    private int db = 1;
    private int raktaron;

    public Termek(String nev) {

        this.nev = nev;

    }

    public void setRaktaron(int raktaron) {
        this.raktaron = Raktar.keszlet(this);
    }

    public int getRaktaron() {
        return raktaron;
    }

    public String getNev() {
        return nev;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public int getDb() {
        return db;
    }
}
