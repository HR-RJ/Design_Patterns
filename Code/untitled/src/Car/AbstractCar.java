package Car;

import Engine.AbstractEngine;

public abstract class AbstractCar {

    int seats;
    public int price = 100;
    public AbstractEngine engine;
    public abstract int getPrice();
    public void print() {
        System.out.printf("This is a car of the type: ");
    };
}

