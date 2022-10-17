package Car;

public abstract class AbstractCar {
    public int price = 100;
    public abstract int getPrice();
    public void print() {
        System.out.printf("This is a car of the type: ");
    };
}