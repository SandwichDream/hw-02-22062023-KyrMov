package sample;

public class Cat extends Animal {

    public Cat(String name, String ration, String color, int weight) {
        super(name, ration, color, weight);
    }

    public Cat() {
        super("Cat", "usually meat", "probably opaque", (int) Math.ceil(Math.random() * 400));
    }

    public String getVoice() {
        return "Meow";
    }

    public void sleep() {
        System.out.println("usually try always");
    }

}