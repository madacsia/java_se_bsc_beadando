package webshop2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestBoltiVasarlas {
    @Test
    public void testAtvetelMod() {
        Termek alma = new Termek("alma");

        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma, 2);

        Vevo vevo = new Vevo("nev", "lakcim", "email", "telefon");
        BoltiVasarlas boltiVasarlas = new BoltiVasarlas(vevo, kosar);
        boltiVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);

        assertThat(boltiVasarlas.getAtvetelMod().toString(), equalTo("BOLT"));
    }

    @Test
    public void testStatusz(){
        Termek alma = new Termek("alma");

        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma,2);

        Vevo vevo = new Vevo("nev","lakcim","email","telefon");

        BoltiVasarlas boltiVasarlas = new BoltiVasarlas(vevo,kosar);
        boltiVasarlas.setFizetesMod(Tipusok.FizetesMod.KÉZPÉNZ);

        assertThat(boltiVasarlas.getStatusz().toString(),equalTo("DELIVERED"));
    }
}
