package Engine;

public class DieselEngine extends AbstractEngine{
    private int price = 50;
    @Override
    public String toString() {
        return "*oil leaks*";
    }
    public void print(){
        System.out.println("Diesel startup noise.......");
    }
}
