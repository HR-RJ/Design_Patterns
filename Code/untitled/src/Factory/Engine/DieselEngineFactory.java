package Factory.Engine;

import Factory.AbstractFactory;

public abstract class DieselEngineFactory extends AbstractFactory {

    private int price = 50;
    public boolean Production = false;
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Standaard price is: "+ price);
    }
}