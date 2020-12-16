package webshop2;

public class Rendeles {
    public Vevo vevo;
    public Kosar kosar;

    private Tipusok.FizetesMod fizetesMod;
    private Tipusok.AtvetelMod atvetelMod;
    private Tipusok.Statusz statusz;

    public Rendeles(Vevo vevo, Kosar kosar) {
        if (kosar.termekek.isEmpty()) {
            throw new HibaKezeles(Tipusok.Hibak.KOSAR_URES);
        }
        this.vevo = vevo;
        this.kosar = kosar;
    }

    public void setFizetesMod(Tipusok.FizetesMod fizetesMod) {
        this.fizetesMod = fizetesMod;
    }

    public void setAtvetelMod(Tipusok.AtvetelMod atvetelMod) {
        this.atvetelMod = atvetelMod;
    }

    public void setStatusz(Tipusok.Statusz statusz) {
        this.statusz = statusz;
    }

    public Tipusok.FizetesMod getFizetesMod() {
        return fizetesMod;
    }

    public Tipusok.AtvetelMod getAtvetelMod() {
        return atvetelMod;
    }

    public Tipusok.Statusz getStatusz() {
        return statusz;
    }
}
