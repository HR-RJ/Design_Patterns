package Car;

public class LadaCar extends AbstractCar {
    private int price = 90;

    void LadaCar(AbstractCar c) {
        super(c);
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Standaard price is: " + price);
    }
}
