package sample;

public class Animal {

    private String name;
    private String ration;
    private String color;
    private int weight;

    public Animal(String name, String ration, String color, int weight) {
        this.name = name;
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {
        this.ration = "eats something";
        this.color = "who knows?";
        this.weight = (int) Math.ceil(Math.random() * 150000);
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return "";
    }

    public void eat() {
        System.out.println(ration);
    }

    public void sleep() {
        System.out.println("whenever he wants");
    }

    public String toString() {
        return "Animal " + name + " [eat = " + ration + ", color = " + color + ", weight = " + weight + " kg]";
    }

}