package Facade;

import java.util.Scanner;

import Builder.BuilderLada;
import Builder.BuilderTesla;
import Builder.BuilderToyota;
import Builder.Director;
import Car.AbstractCar;
import Decorator.Cupholder;
import Decorator.MachineGun;
import Decorator.Spoiler;


public class CarDealerShip {
    Director director = new Director();
    BuilderLada ladaBuilder = new BuilderLada();
    BuilderTesla teslaBuilder = new BuilderTesla();
    BuilderToyota toyotaBuilder = new BuilderToyota();

    public AbstractCar getCar() {
        Scanner s = new Scanner(System.in);
        AbstractCar car = null;
        String input;
        boolean cont = false;

        System.out.println("Options: ");
        System.out.println("LadaA - family edition Lada");
        System.out.println("LadaB - sport edition Lada");
        System.out.println("TeslaA - model x Tesla");
        System.out.println("TeslaB - roadster Tesla");
        System.out.println("ToyotaA - family edition Toyota");
        System.out.println("ToyotaB - sport edition Toyota");
        while (!cont) {
            switch (s.next()) {
                case "LadaA" -> {
                    director.buildLadaA(ladaBuilder);
                    car = ladaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "LadaB" -> {
                    director.buildLadaB(ladaBuilder);
                    car = ladaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "TeslaA" -> {
                    director.buildTeslaA(teslaBuilder);
                    car = teslaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "TeslaB" -> {
                    director.buildTeslaB(teslaBuilder);
                    car = teslaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "ToyotaA" -> {
                    director.buildToyotaA(toyotaBuilder);
                    car = toyotaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                }
                case "ToyotaB" -> {
                    director.buildToyotaB(toyotaBuilder);
                    car = toyotaBuilder.returnCar();
                    System.out.println("price: " + car.getPrice());
                }
                default -> System.out.println("Please enter valid car type");
            }
        }

        System.out.println("Decorate your vehicle using:");
        System.out.println("- Spoiler    || 80");
        System.out.println("- Cupholder  || 300");
        System.out.println("- Machinegun || 1000");
        System.out.println("Type \"Done\" to finish your car");
        input = s.next();
        while (!input.equals("Done")) {
            switch (input) {
                case "Spoiler" -> {
                    car = new Spoiler(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "Cupholder" -> {
                    car = new Cupholder(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "Machinegun" -> {
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
            if (input.equals("Y")) {
                return car;
            } else if (input.equals("N")) {
                return this.getCar();
            } else {
                System.out.println("Could not recognise input, Please enter Y or N");
            }
        }
    }

}