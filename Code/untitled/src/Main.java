import Car.AbstractCar;
import Car.ToyotaCar;
import Car.LadaCar;
import Factory.AbstractFactory;
import Factory.Engine.DieselEngineFactory;
import Factory.Engine.ElectricEngineFactory;
import Factory.Engine.NuclearEngineFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nieuw factory opened today !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        AbstractCar a = new LadaCar();
        AbstractCar b = new ToyotaCar();
        a.print();
        b.print();
        AbstractFactory c = new DieselEngineFactory();
        AbstractFactory d = new ElectricEngineFactory();
        AbstractFactory e = new NuclearEngineFactory();
        c.print();
        d.print();
        e.print();
    }
}
