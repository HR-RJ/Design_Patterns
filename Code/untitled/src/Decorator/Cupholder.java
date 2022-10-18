package Decorator;

import Car.AbstractCar;

public class Cupholder extends AbstractDecorator {
    int price = 300;

    public Cupholder(AbstractCar _base) {
        super(_base);
    }

    public int getPrice(){
        return super.getPrice() + price;
    }
    public void print(){
        super.print();
        System.out.println("With a cupholder...");
    }
}