package entities;

public class Car {
    public String name;
    public Integer speed = 0;

    public void changeName(String newName) {
        name = newName;
    }

    public void changeSpeed(Integer increment) {
        speed = speed + increment;
    }

    public void printStates() {
        System.out.println("Car name: " + name + ", " + "Speed: " + speed);
    }
}
