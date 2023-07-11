package sample;

public class Cat extends Animal {

    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
        super("usually meat", "probably opaque", (int) Math.ceil(Math.random() * 400));
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(getRation());
    }

    public String getVoice() {
        return "Meow";
    }

    public void sleep() {
        System.out.println("usually try always");
    }

}