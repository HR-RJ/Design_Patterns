package Factory.Engine;

import Car.AbstractCar;
import Factory.AbstractFactory;

public class ElectricEngineFactory extends AbstractFactory {

    private int price = 90;
    void Lada(AbstractCar c){
    }
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Standaard price is: "+ price);
    }

    }

