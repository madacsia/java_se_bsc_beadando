package webshop2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class VevoTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void vevoTolt() {
         assertThat(new Vevo("név","lakcim","email","telefon").getNev(),equalTo("név"));
    }

    @Test
    public void vevoHibas() {
        expectedException.expect(HibaKezeles.class);
        expectedException.expectMessage("A vevő adatainak kitöltése kötelező.");
        new Vevo("név", "lakcim", "email", "");
    }
}
