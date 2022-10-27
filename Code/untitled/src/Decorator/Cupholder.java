package decorator;

import car.Car;

public class Cupholder extends AbstractDecorator {

    public Cupholder(Car base) {
        super(base, 300);
    }

    public int getPrice(){
        return super.getPrice();
    }
    public void print(){
        super.print();
        System.out.println("With a cupholder...");
    }
}