package Decorator;

import Car.AbstractCar;

public abstract class AbstractDecorator extends AbstractCar{
    AbstractCar base = null;
    private int price = 10;
    public AbstractDecorator(AbstractCar _base) {
        base = _base;
    }

    public int price() {
        if (base != null) {
            return base.getPrice();
        }
        else return 0;
    }

    public void print() {
        if (base != null) {
            base.print();
        }
    }

}
