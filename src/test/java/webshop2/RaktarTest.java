package webshop2;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class RaktarTest {
    @Test
    public void testKeszlet(){
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);

        assertThat(Raktar.keszlet(alma),equalTo(2));
    }

    @Test
    public void testKeszletbolTorol(){
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        Raktar.termekek.add(alma);
        Raktar.keszletbolTorol("alma");

        assertThat(Raktar.keszlet(alma),equalTo(1));
    }
}
