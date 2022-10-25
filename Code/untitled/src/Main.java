import Builder.BuilderLada;
import Builder.Director;
import Car.AbstractCar;
import Decorator.MachineGun;
import Decorator.Spoiler;

public class Main {
    public static void main(String[] args) {
        System.out.println("New factory opened today !!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); // ☺
        Director director = new Director();
        BuilderLada builder = new BuilderLada();
        director.buildLada(builder);
        AbstractCar a = builder.returnCar();
//        AbstractCar a = new LadaCar();
//        AbstractCar b = new ToyotaCar();
//        a.print();
//        b.print();
        System.out.println(a.getPrice());
        a = new Spoiler(a);
        a.print();
        System.out.println(a.getPrice());

        a.print();
        System.out.println(a.getPrice());
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
