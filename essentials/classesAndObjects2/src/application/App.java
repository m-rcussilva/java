package application;

import entities.Car;

public class App {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.changeName("Tesla");
        c1.changeSpeed(100);
        c1.printStates();

        System.out.println();

        c2.changeName("Ferrari");
        c2.changeSpeed(300);
        c2.printStates();
        c2.changeSpeed(50);
        c2.printStates();
    }
}
