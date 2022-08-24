package Fighter;

public abstract class Fighter {
public String name;
public double weight;

public Fighter(String name, double weight){
    this.name = name;
    this.weight = weight;
}

public abstract String getName();
public abstract double getWeight();

//Fighter ehab = new Fighter("ehab", 12.0);

}
