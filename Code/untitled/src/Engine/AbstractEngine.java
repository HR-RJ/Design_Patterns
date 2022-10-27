package engine;

public abstract class AbstractEngine {
    private int price;

    protected AbstractEngine(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println("Windows error noise...");
    }
    public int getPrice(){
        return price;
    }
}
