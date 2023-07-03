package sample;

public class Dog extends Animal {

    public Dog(String name, String ration, String color, int weight) {
        super(name, ration, color, weight);
    }

    public Dog() {
        super("Dog", "usually meat", "probably opaque", (int) Math.ceil(Math.random() * 100));
    }

    public String getVoice() {
        return "Woof";
    }

    public void sleep() {
        System.out.println("usually when there is nothing to do");
    }

}