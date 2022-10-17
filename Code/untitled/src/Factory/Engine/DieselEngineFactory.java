package Factory.Engine;

import Factory.AbstractFactory;

public class DieselEngineFactory extends AbstractFactory {

    private int price = 50; 
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Standaard price is: "+ price);
    }
}