package decorator;

import car.Car;

public class MachineGun extends AbstractDecorator{

    public MachineGun(Car base) {
        super(base, 1000);
    }

    public int getPrice(){
        return super.getPrice();
    }
    public void print(){
        super.print();
        System.out.println("With a machinegun - pew pew");
    }
}
