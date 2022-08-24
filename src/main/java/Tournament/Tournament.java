package Tournament;

import Fighter.Fighter;

import java.util.ArrayList;

public class Tournament {

    private ArrayList<Fighter> fighters;

    public ArrayList<Fighter> getFighters() {
        return fighters;
    }

    public int countFighters(){ //TEST
        return this.fighters.size();
    }

    public void addFighter(Fighter fighter){ //TEST
        this.fighters.add(fighter);
    }
}
