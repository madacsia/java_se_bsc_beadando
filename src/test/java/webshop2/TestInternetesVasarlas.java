package webshop2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestInternetesVasarlas {

        @Test
        public void testTolt() {
            Termek alma = new Termek("alma");

            Raktar.termekek.add(alma);
            Raktar.termekek.add(alma);

            Kosar kosar = new Kosar();
            kosar.kosarbaTermekDb(alma, 2);

            Vevo vevo = new Vevo("nev", "lakcim", "email", "telefon");
            InternetesVasarlas internetesVasarlas = new InternetesVasarlas(vevo,kosar);

            assertThat(internetesVasarlas.getStatusz().toString(), equalTo("BOOKED"));
        }


}
