package decorator;

import car.Car;

/**
 * Basis for the decorators
 */
public abstract class AbstractDecorator implements Car {

    private Car base;
    private int price;

    protected AbstractDecorator(Car base, int price) {
        this.base = base;
        this.price = price;
    }

    @Override
    public int getPrice() {
        // if there is a base (a car) then you add the price of the decorator to the price of the car
        // otherwise just print the price of the decorator
        return base != null ? base.getPrice() + this.price : this.price;
    }

    @Override
    public void print() {
        if (base != null) {
            base.print();
        }
    }
}
