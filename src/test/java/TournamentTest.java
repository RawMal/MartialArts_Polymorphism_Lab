import Fighter.Fighter;
import FighterCategory.Boxer;
import FighterCategory.Judoka;
import FighterCategory.Wrestler;
import Tournament.Tournament;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TournamentTest {

    private Tournament tournament;

    @BeforeEach
    public void setup() {
        tournament = new Tournament(); }

        @Test
        public void canCountFighters(){
            int expected = 0;
            int actual = tournament.countFighters();
            assertEquals(expected, actual);
        }

        @Test
        public void CanAddFighter(){
            Fighter fighter = new Judoka("John", 99.0, "black");
            tournament.addFighter(fighter);
            int expected = 1;
            int actual = tournament.countFighters();
            assertEquals(expected, actual);

        }

        @Test
        public void canAddMultipleFighters(){
            Fighter wrestler = new Wrestler("Doe",100.0,"Greco-Roman");
            Fighter boxer = new Boxer("AJ",110.0,10,4,3);
            int expected = 2;
            int actual = tournament.countFighters();
            assertEquals(expected, actual);

        }


    }

