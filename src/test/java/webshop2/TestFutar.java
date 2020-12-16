package webshop2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestFutar {

        @Test
        public void testStatusz() {
            Termek alma = new Termek("alma");

            Raktar.termekek.add(alma);
            Raktar.termekek.add(alma);

            Kosar kosar = new Kosar();
            kosar.kosarbaTermekDb(alma, 2);

            Vevo vevo = new Vevo("nev", "lakcim", "email", "telefon");
            InternetesVasarlas internetesVasarlas = new InternetesVasarlas(vevo,kosar);
            //internetesVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);
            Futar futar = new Futar(internetesVasarlas);

            assertThat(internetesVasarlas.getStatusz().toString(), equalTo("IN_PROGRESS"));
        }

    @Test
    public void testLeszallit() {
        Termek alma = new Termek("alma");

        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma, 2);

        Vevo vevo = new Vevo("nev", "lakcim", "email", "telefon");
        InternetesVasarlas internetesVasarlas = new InternetesVasarlas(vevo,kosar);
        internetesVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);
        Futar futar = new Futar(internetesVasarlas);
        futar.leszallit();

        assertThat(futar.rendeles.getStatusz().toString(), equalTo("DELIVERED"));
    }

    @Test
    public void testRosszSzallit() {
        Termek alma = new Termek("alma");

        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma, 2);

        Vevo vevo = new Vevo("nev", "lakcim", "email", "telefon");
        InternetesVasarlas internetesVasarlas = new InternetesVasarlas(vevo,kosar);
        internetesVasarlas.setAtvetelMod(Tipusok.AtvetelMod.HAZHOZSZALLITAS);
        Futar futar = new Futar(internetesVasarlas);
        futar.rosszSzallit("Nem voltak otthon");

        assertThat(futar.rendeles.getStatusz().toString(), equalTo("FAIlED_DELIVERED"));
    }

    }

