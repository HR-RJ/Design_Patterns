package Decorator;

import Car.AbstractCar;

public class Spoiler extends AbstractDecorator {
    int price = 80;

    public Spoiler(AbstractCar _base) {
        super(_base);
    }

    public int getPrice(){
        return super.getPrice() + price;
    }
    public void print(){
        super.print();
        System.out.println("With a spoiler...");
    }
}
