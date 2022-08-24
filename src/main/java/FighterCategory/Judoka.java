package FighterCategory;
import Interface.IGrapple;
import Fighter.Fighter;
import Interface.IThrow;

public class Judoka extends Fighter implements IGrapple, IThrow {

    private String beltColour;

    public Judoka(String name, double weight, String beltColour) {
        super(name, weight);//These are the parameters for the Fighter parent class
        this.beltColour = beltColour;
    }

    public String getBeltColour(){//TEST
        return beltColour;
    }

    public String getName(){//TEST
        return name;
    }

    public double getWeight(){//TEST
        return weight;
    }

    public String grapple(String name){
        return String.format("%s grappled their opponent", name);
    }

    public String threw(String name) {
        return String.format("%s threw their opponent", name);

    }

}
