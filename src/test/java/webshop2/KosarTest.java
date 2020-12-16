package webshop2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class KosarTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testKosarbaTermekDbHiba(){
        expectedException.expect(HibaKezeles.class);
        expectedException.expectMessage("A rendelt mennyiség nem haladhatja meg a raktárkészletet.");
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Kosar kosar = new Kosar();

        kosar.kosarbaTermekDb(alma,3);

    }
    @Test
    public void testDarabszam(){
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma,2);

        assertThat(kosar.darabszam(alma),equalTo(2));

    }
    @Test
    public void testKosarbaTermekDb(){
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Kosar kosar = new Kosar();
        kosar.kosarbaTermekDb(alma,2);

        assertThat(Raktar.keszlet(alma),equalTo(0));

    }
}
