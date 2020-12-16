package webshop2;

public class BoltiVasarlas extends Rendeles{

    public BoltiVasarlas(Vevo vevo, Kosar kosar) {
        super(vevo, kosar);
        super.setAtvetelMod(Tipusok.AtvetelMod.BOLT);
    }

    @Override
    public void setAtvetelMod(Tipusok.AtvetelMod atvetmod) {

    }

    @Override
    public void setFizetesMod(Tipusok.FizetesMod fizetesMod) {
        if (fizetesMod.equals(Tipusok.FizetesMod.KÁRTYA)||fizetesMod.equals(Tipusok.FizetesMod.KÉZPÉNZ)){
            super.setStatusz(Tipusok.Statusz.DELIVERED);
        }

    }
}
