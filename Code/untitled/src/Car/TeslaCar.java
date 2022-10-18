package Car;


public class TeslaCar extends AbstractCar {
    private int price = 150;
    public Engine engine = null;

    public int getPrice() {
        if(engine == null){
            System.out.println("Oh no, no engine found ☺, good luck driving tho");
            return super.price+price;
        }
        else {
            return super.price+price+engine.getPrice();
        }
    }

    public void print() {
        System.out.println("Standard price is: " + price);
    }
}
