package Car;
// package Engine;

public class LadaCar extends AbstractCar {
    private int price = 10;
    // public Engine engine = null;
    public LadaCar() {
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lada");
        System.out.println("Total price is: " + (super.price+price));
    }
}
