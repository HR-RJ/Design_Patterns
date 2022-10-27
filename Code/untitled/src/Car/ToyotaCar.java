package car;
import engine.AbstractEngine;

public class ToyotaCar extends AbstractCar {

    public ToyotaCar(AbstractEngine engine, int seats, boolean manual){
        super(engine, seats, manual, 200);
    }

    @Override
    public void print() {
        System.out.println("Type Car: Toyota");
        super.print();
    }
}
