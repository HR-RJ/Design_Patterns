package Car;
// package Engine;

public class LadaCar extends AbstractCar {
    private int price = 10;
//    public Engine Tengine = null;
    private final Engine engine;

    public LadaCar(Engine _engine) {
        this.engine = _engine;
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

    @Override
    public void print() {
        super.print();
        System.out.println("Lada");
//        System.out.println("Total price is: " + (super.price+price));
    }
}
/*

 */