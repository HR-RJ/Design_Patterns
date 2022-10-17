package Car;

public class TeslaCar {
    private int price = 150;

    TeslaCar(AbstractCar c) {
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Standaard price is: " + price);
    }
}
