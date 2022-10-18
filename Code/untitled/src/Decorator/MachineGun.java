package Decorator;

import Car.AbstractCar;

public class MachineGun extends AbstractDecorator{
    int price = 1000;

    public MachineGun(AbstractCar _base) {
        super(_base);
    }

    public int getPrice(){
        return super.getPrice() + price;
    }
    public void print(){
        super.print();
        System.out.println("With a machinegun - pew pew");
    }
}
