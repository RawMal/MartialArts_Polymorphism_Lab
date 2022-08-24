import FighterCategory.Judoka;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JudokaTest {

    Judoka judoka;

    @BeforeEach
    public void setUp(){ judoka = new Judoka("Sam",75.0,"black");}

    @Test
    public void judokaCanGrapple(){
        String result = judoka.grapple("Sam");
        assertThat(result).isEqualTo("Sam grappled their opponent");
    }

    @Test
    public void judokaCanThrow(){
        String result = judoka.threw("Sam");
        assertThat(result).isEqualTo("Sam threw their opponent");
    }
}
