package car;

import engine.AbstractEngine;

public class LadaCar extends AbstractCar {

    public LadaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 90);
    }

    @Override
    public void print() {
        System.out.println("Type Car: Lada");
        super.print();
    }
}
