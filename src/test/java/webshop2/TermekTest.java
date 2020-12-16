package webshop2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class TermekTest {

    @Test
    public void termekRaktaron () {
        Termek alma = new Termek("alma");
        Raktar.termekek.add(alma);
        alma.setRaktaron(Raktar.keszlet(alma));
        assertThat(alma.getRaktaron(),equalTo(1));
    }
    }

