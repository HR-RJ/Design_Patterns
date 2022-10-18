import Builder.BuilderLada;
import Builder.Director;
import Car.AbstractCar;
import Car.ToyotaCar;
import Car.LadaCar;
import Car.Engine;
import Decorator.MachineGun;
import Decorator.Spoiler;
import Factory.AbstractFactory;
import Factory.Engine.DieselEngineFactory;
import Factory.Engine.ElectricEngineFactory;
import Factory.Engine.NuclearEngineFactory;

import java.sql.Driver;

public class Main {
    public static void main(String[] args) {
        System.out.println("New factory opened today !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Director director = new Director();
        BuilderLada builder = new BuilderLada();
        director.buildLada(builder);
        AbstractCar a = builder.returnCar();
//        AbstractCar a = new LadaCar(); //constructor ☺
//        AbstractCar b = new ToyotaCar();
//        a.print();
//        b.print();
        System.out.println(a.getPrice());
        a = new Spoiler(a);
        a.print();
        System.out.println(a.getPrice());

        a.engine = new Engine();
        a.engine.print(); //go vroom
        a.print();
        System.out.println(a.getPrice()); //aaaaaaaaaaaaaaah does not work
        a = new MachineGun(a);
        a.print();
        a = new MachineGun(a);
        a.print();
        System.out.println(a.getPrice());
//        AbstractFactory c = new DieselEngineFactory();
//        AbstractFactory d = new ElectricEngineFactory();
//        AbstractFactory e = new NuclearEngineFactory();
//        c.print();
//        d.print();
//        e.print();
    }
}
