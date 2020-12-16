package webshop2;

public class InternetesVasarlas extends Rendeles{

    public InternetesVasarlas(Vevo vevo, Kosar kosar) {

        super(vevo, kosar);
        super.setStatusz(Tipusok.Statusz.BOOKED);
    }

    @Override
    public void setAtvetelMod(Tipusok.AtvetelMod atvetmod) {
        /*if (atvetmod.equals(Tipusok.AtvetelMod.BOLT));
            super.setStatusz(Tipusok.Statusz.DELIVERED);*/
        if (atvetmod.equals(Tipusok.AtvetelMod.HAZHOZSZALLITAS))
            super.setAtvetelMod(atvetmod);

    }
}
