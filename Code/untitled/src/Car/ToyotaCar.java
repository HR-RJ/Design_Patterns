package Car;
// package Engine;

public class ToyotaCar extends AbstractCar {
    private int price = 100;
    // public Engine engine = null;
    public ToyotaCar(){
    }
    public int getPrice(){
        return price;
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
