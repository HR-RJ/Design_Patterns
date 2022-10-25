package Builder;

public class Director {
    public void buildLada(Builder builder) {
        int seats = 4;
        builder.setEngine("Diesel");
        builder.setSeats(seats);
        builder.setManual(true);

    }
}
