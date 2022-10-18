package Builder;

import Car.Engine;

public class Director {
    public void buildLada(Builder builder) {
        int seats = 4;
        builder.setEngine(new Engine());
        builder.setSeats(seats);
        builder.setManual(true);

    }
}
