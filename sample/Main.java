package sample;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Shtooka", "feed", "gray", 3);
        Dog dog1 = new Dog("Chuck", "feed", "red", 33);
        Dog dog2 = new Dog();
        Veterinarian person1 = new Veterinarian("Bill");

        System.out.println(cat1 + " and name is " + cat1.getName());
        System.out.println(cat1.getVoice());
        cat1.eat();
        cat1.sleep();

        System.out.println(System.lineSeparator() + dog1 + " and name is " + dog1.getName());
        System.out.println(dog1.getVoice());
        dog1.eat();
        dog1.sleep();

        System.out.println(System.lineSeparator() + dog2 + " and name is " + dog2.getName());
        System.out.println(dog2.getVoice());
        dog2.eat();
        dog2.sleep();

        person1.treatment(dog2);
        System.out.println(System.lineSeparator() + person1);

        person1.treatment(dog1);
        System.out.println(System.lineSeparator() + person1);

    }
}