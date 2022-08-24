import FighterCategory.Wrestler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrestlerTest {

    Wrestler wrestler;

    @BeforeEach
    public void setUp(){ wrestler = new Wrestler("Khabib",80,"freestyle");}

    @Test
    public void canWrestlerSayCatchPhrase(){
        String expected = "I will smesh him";
        String actual = wrestler.catchPhrase();
        assertEquals(expected, actual);
    }

    @Test
    public void canSayCatchPhraseWithOverloaded(){
        String expected = "I will smesh him, Send me location";
        String actual = wrestler.catchPhrase("Send me location");
        assertEquals(expected, actual);
    }


    @Test
    public void wrestlerCanGrapple(){
        String result = wrestler.grapple("Khabib");
        assertThat(result).isEqualTo("Khabib grappled their opponent");
    }

    @Test
    public void wrestlerCanThrow(){
        String result = wrestler.threw("Khabib");
        assertThat(result).isEqualTo("Khabib threw their opponent");
    }
}
