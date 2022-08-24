package FighterCategory;

import Fighter.Fighter;
import Interface.IPunch;

public class Boxer extends Fighter implements IPunch {

    private int wins;
    private int losses;
    private int draws;

    public Boxer(String name, double weight, int wins, int losses, int draws) {
        super(name, weight);
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }
    public String getName(){//TEST
        return name;
    }

    public double getWeight(){//TEST
        return weight;
    }

    public String punch(String name) {
        return String.format("%s punched their opponent", name);
    }

}
