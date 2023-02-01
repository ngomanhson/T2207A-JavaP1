package Session5;

public class Animal {
    public String kind;
    protected String color;
    private double weight = 20;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eating..."+weight);
    }

    public void run(){
        System.out.println("Running...");
    }
}
