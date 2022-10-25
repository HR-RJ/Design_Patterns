package Car;
import Engine.AbstractEngine;


public class TeslaCar extends AbstractCar {
    private int price = 350;
    private boolean manual;
    public AbstractEngine engine = null;


    public TeslaCar(AbstractEngine _engine, int _seats, boolean _manual){
        this.engine = _engine;
        this.seats = _seats;
        this.manual = _manual;
    }

    public int getPrice() {
        if(engine == null){
            System.out.println("Oh no, no engine found ☺, good luck driving tho");
            return super.price+price;
        }
        else {
            return super.price+price+engine.getPrice();
        }
    }

    public void print() {
        System.out.println("Tesla");
        super.print();
    }
}
