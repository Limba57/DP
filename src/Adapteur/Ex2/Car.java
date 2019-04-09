package Adapteur.Ex2;

public abstract class Car {

    String name;
    int speed;
    String unity;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        unity = "MPH";
    }

    public String jeRoule() {
        return "Je suis " + name + " je roule a " + speed + " " + unity;
    }
}
