package Car;

import Engine.AbstractEngine;

public abstract class AbstractCar {
    protected int seats;
    protected int price = 100;
    protected AbstractEngine engine;
    protected boolean manual;

    public abstract int getPrice();
    public void print() {
        System.out.println("amount of seats: "+ seats);
        System.out.println("engine: "+ engine);
        if (manual) {
            System.out.println("Transmission is manual");
        } else {
            System.out.println("Transmission is automatic");
        }
    }
}

