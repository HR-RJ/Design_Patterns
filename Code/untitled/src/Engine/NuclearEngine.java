package Engine;

public class NuclearEngine extends AbstractEngine{
    private int price = 1000;

    public String toString() {
        return "*radiates radiation*";
    }

    public void print(){
        System.out.println("Geiger counter going mad noise.....");
    }
}
