package Car;
// package Engine;
import Engine.AbstractEngine;

public class ToyotaCar extends AbstractCar {
    private int price = 100;

    public ToyotaCar(AbstractEngine _engine, int _seats, boolean _manual){
        this.engine = _engine;
        this.seats = _seats;
        this.manual = _manual;
    }
    public int getPrice(){
        if(engine == null){
            System.out.println("Oh no, no engine found ☺, good luck driving tho");
            return super.price+price;
        }
        else {
            return super.price+price+engine.getPrice();
        }
    }
    @Override
    public void print() {
        System.out.println("Toyota");
        super.print();
    }
}
