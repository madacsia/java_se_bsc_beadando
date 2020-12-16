package webshop2;

public class Futar {

    public Rendeles rendeles;
    private String megjegyzes;

    public Futar(Rendeles rendeles) {
        this.rendeles = rendeles;
        this.rendeles.setStatusz(Tipusok.Statusz.IN_PROGRESS);
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }


    public void leszallit() {
        if (rendeles.getAtvetelMod()==null || rendeles.getAtvetelMod().equals(Tipusok.AtvetelMod.BOLT))
            throw new HibaKezeles(Tipusok.Hibak.NINCS_KISZALLITAS);
        if (rendeles.getAtvetelMod().equals(Tipusok.AtvetelMod.HAZHOZSZALLITAS))
            rendeles.setStatusz(Tipusok.Statusz.DELIVERED);
    }


    public void rosszSzallit(String p_megjegyzes) {
    if(p_megjegyzes.isEmpty()) {
        throw new HibaKezeles(Tipusok.Hibak.NINCS_MEGJEGYZES);
    }
        this.megjegyzes = p_megjegyzes;
        //rendeles.statusz=Tipusok.Statusz.FAIlED_DELIVERED;
        this.rendeles.setStatusz(Tipusok.Statusz.FAIlED_DELIVERED);

    }
}
