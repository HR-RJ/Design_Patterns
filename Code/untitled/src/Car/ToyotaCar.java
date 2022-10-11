package Car;

public class ToyotaCar extends AbstractCar {

        private int price = 100;
        void Toyota(AbstractCar c){
        }
        public int getPrice(){
            return price;
        }
        public void print(){
            System.out.println("Standaard price is: "+price);
        }
}
