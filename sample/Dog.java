package sample;

public class Dog extends Animal {

    private String name;

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
        super("usually meat", "probably opaque", (int) Math.ceil(Math.random() * 100));
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(getRation());
    }

    public String getVoice() {
        return "Woof";
    }

    public void sleep() {
        System.out.println("usually when there is nothing to do");
    }

}