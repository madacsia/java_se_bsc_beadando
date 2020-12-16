package webshop2;

public class HibaKezeles extends RuntimeException{
     private Tipusok.Hibak hiba;

    public HibaKezeles(Tipusok.Hibak p_hiba) {
        super(p_hiba.toString());
    }

    }
