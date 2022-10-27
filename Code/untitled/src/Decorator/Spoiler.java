package decorator;

import car.Car;

public class Spoiler extends AbstractDecorator {

    public Spoiler(Car base) {
        super(base, 80);
    }

    public int getPrice(){
        return super.getPrice();
    }
    public void print(){
        super.print();
        System.out.println("With a spoiler...");
    }
}
