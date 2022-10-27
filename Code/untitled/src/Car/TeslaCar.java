package car;
import engine.AbstractEngine;

public class TeslaCar extends AbstractCar {

    public TeslaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 450);
    }

    @Override
    public void print() {
        System.out.println("Type Car: Tesla");
        super.print();
    }
}
