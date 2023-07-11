package sample;

public class Animal {

    private String ration;
    private String color;
    private int weight;

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
        this.ration = "eats something";
        this.color = "who knows?";
        this.weight = (int) Math.ceil(Math.random() * 150000);
    }

    public String getRation() {
        return ration;
    }

    public String getVoice() {
        return "";
    }

    public void eat() {

    }

    public void sleep() {
        System.out.println("whenever he wants");
    }

    public String toString() {
        return "Animal [eat = " + ration + ", color = " + color + ", weight = " + weight + " kg]";
    }

}