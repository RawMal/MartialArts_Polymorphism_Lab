package FighterCategory;

import Fighter.Fighter;
import Interface.IGrapple;
import Interface.IThrow;

public class Wrestler extends Fighter implements IThrow, IGrapple{

    private String wrestlingDiscipline;

    public Wrestler(String name, double weight, String wrestlingDiscipline) {
        super(name, weight);
        this.wrestlingDiscipline = wrestlingDiscipline;
    }

    public String getWrestlingDiscipline() {
        return wrestlingDiscipline;//TEST
    }


    public String catchPhrase() {//TEST
        return "I will smesh him";
    }

    public String catchPhrase(String message) {//TEST
        return String.format("%s", message);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String threw(String name) {
        return String.format("%s threw their opponent", name);

    }

    public String grapple(String name){
        return String.format("%s grappled their opponent", name);
    }
}