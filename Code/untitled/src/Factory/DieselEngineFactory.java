package Factory;


public class DieselEngineFactory extends AbstractFactory {

    private int price = 90;
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Standaard price is: "+ price);
    }
}