package Car;
// package Engine;
import Engine.AbstractEngine;

public class ToyotaCar extends AbstractCar {
    private int price = 100;
     public AbstractEngine engine = null;
    public ToyotaCar(){
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
//        if (!engine == null){
//            System.out.println(engine.vroom());
//        }
        super.print();
        System.out.println(" Toyota");
        System.out.println("Total price is: " + (super.price+price));
    }
}
