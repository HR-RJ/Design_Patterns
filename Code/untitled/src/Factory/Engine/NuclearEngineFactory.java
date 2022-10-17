package Factory.Engine;

import Car.AbstractCar;
import Factory.AbstractFactory;

public class NuclearEngineFactory extends AbstractFactory {

    private int price = 190;
    void Lada(AbstractCar c){
    }
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Standaard price is: "+ price);
    }

    }

