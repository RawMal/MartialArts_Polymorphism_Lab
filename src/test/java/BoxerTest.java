import FighterCategory.Boxer;
import FighterCategory.Judoka;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoxerTest {
    Boxer boxer;

    @BeforeEach
    public void setUp(){ boxer = new Boxer("AJ",110.0,20,5,2);}

    @Test
    public void BoxerCanGrapple(){
        String result = boxer.punch("AJ");
        assertThat(result).isEqualTo("Sam grappled their opponent");
    }
}
