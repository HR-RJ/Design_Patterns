package car;

import engine.AbstractEngine;

/**
 * Basis for the different types of cars
 * Adds the price of the engine inside it to the getPrice of the car
 * Prints out all the component types whenever the print is called
 */
public abstract class AbstractCar implements Car {
    protected int seats;
    protected int price;
    protected AbstractEngine engine;
    protected boolean manual;

    protected AbstractCar(AbstractEngine engine, int seats, boolean manual, int price) {
        this.seats = seats;
        this.engine = engine;
        this.manual = manual;
        this.price = price;
    }

    @Override
    public int getPrice() {
        if(engine == null){
            System.out.println("Oh no, no engine found ☺, good luck driving tho");
            return this.price;
        }
        else {
            return this.price + engine.getPrice();
        }
    }

    public void print() {
        System.out.println("amount of seats: "+ seats);
        System.out.println("engine: "+ engine);
        System.out.print("Transmission type: ");
        if (manual) {
            System.out.println("manual");
        } else {
            System.out.println("automatic");
        }
    }
}

