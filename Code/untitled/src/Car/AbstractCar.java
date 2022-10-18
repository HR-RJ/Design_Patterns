package Car;

public abstract class AbstractCar {

    int seats = 0;
    public int price = 100;
    public Engine engine = new Engine();
    public abstract int getPrice();
    public void print() {
        System.out.printf("This is a car of the type: ");
    };
}

