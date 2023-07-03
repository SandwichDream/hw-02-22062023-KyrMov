package sample;

public class Veterinarian {

    private String name;
    private String patient;

    public Veterinarian(String name) {
        this.name = name;
    }

    public void treatment(Animal animal) {
        this.patient = animal.toString();
    }

    public String toString() {
        return name + " will treatment " + patient;
    }

}
