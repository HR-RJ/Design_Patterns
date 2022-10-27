import facade.CarDealership;

/**
 * The main code
 * runs the getCar() function of the facade (carDealership) which lets the customer pick and design their car
 * */
public class Main {
    public static void main(String[] args) {
        CarDealership carDealerShip = new CarDealership();

        System.out.println("New factory opened today !!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); // ☺

        carDealerShip.getCar();

    }
}
