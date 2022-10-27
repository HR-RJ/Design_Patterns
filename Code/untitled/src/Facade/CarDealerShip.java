package facade;

import java.util.Scanner;

import builder.Builder;
import builder.BuilderLada;
import builder.BuilderTesla;
import builder.BuilderToyota;
import builder.Director;
import car.Car;
import decorator.Cupholder;
import decorator.MachineGun;
import decorator.Spoiler;

/**
 * The facade, creates the required builders + director for car building upon initialisation
 * The getCar() function which gives the customer a few choices
 * First the type of car gets selected
 * After that as many decorations as wanted can be added onto the car
 * And finally there is an option to reset the process and pick a new car or to accept the car,
 * which then gets returned
 */

public class CarDealership {

    private final Director director;
    private final Builder ladaBuilder;
    private final Builder teslaBuilder;
    private final Builder toyotaBuilder;

    public CarDealership() {
        this.director = new Director();
        this.ladaBuilder = new BuilderLada();
        this.teslaBuilder = new BuilderTesla();
        this.toyotaBuilder = new BuilderToyota();
    }

    public Car getCar() {
        Scanner s = new Scanner(System.in);
        Car car = null;
        String input;
        boolean cont = false;

        System.out.println("""
            Options: 
            [0] - family edition Lada
            [1] - sport edition Lada
            [2] - model x Tesla
            [3] - roadster Tesla
            [4] - family edition Toyota
            [5] - sport edition Toyota
            """);
        while (!cont) {
            switch (s.next()) {
                case "0" -> {
                    director.buildLadaA(ladaBuilder);
                    car = ladaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "1" -> {
                    director.buildLadaB(ladaBuilder);
                    car = ladaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "2" -> {
                    director.buildTeslaA(teslaBuilder);
                    car = teslaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "3" -> {
                    director.buildTeslaB(teslaBuilder);
                    car = teslaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "4" -> {
                    director.buildToyotaA(toyotaBuilder);
                    car = toyotaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                }
                case "5" -> {
                    director.buildToyotaB(toyotaBuilder);
                    car = toyotaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                }
                default -> System.out.println("Please enter valid car type");
            }
        }

        System.out.println("""
            Decorate your vehicle using:
            [0] - Spoiler    || 80
            [1] - Cupholder  || 300
            [2] - Machinegun || 1000
            Type "Done" to finish your car
            """);
        input = s.next();
        while (!input.equalsIgnoreCase("Done")) {
            switch (input) {
                case "0" -> {
                    car = new Spoiler(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "1" -> {
                    car = new Cupholder(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "2" -> {
                    car = new MachineGun(car);
                    System.out.println("price: " + car.getPrice());
                }
                default -> System.out.println("Invalid decoration");
            }
            input = s.next();
        }
        System.out.println("total price: " + car.getPrice());
        System.out.println("Is this what you want? \n");
        car.print();
        System.out.println();
        System.out.println(" Y - yes || N - no");
        while (true){
            input = s.next();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("here is your car");
                return car;
            } else if (input.equalsIgnoreCase("N")) {
                return this.getCar();
            } else {
                System.out.println("Could not recognise input, Please enter Y or N");
            }
        }
    }

}