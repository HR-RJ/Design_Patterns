package Builder;

public class Director {
    public void buildLadaA(Builder builder) { //family
        builder.setEngine("Diesel");
        builder.setSeats(4);
        builder.setManual(false);
    }
    public void buildLadaB(Builder builder) { //sports
        builder.setEngine("Nuclear");
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildTeslaA(Builder builder) { //Model X
        builder.setEngine("Electric");
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildTeslaB(Builder builder) { //roadster
        builder.setEngine("Electric");
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildToyotaA(Builder builder) { //family
        builder.setEngine("diesel");
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildToyotaB(Builder builder) { //sports
        builder.setEngine("Electric");
        builder.setSeats(2);
        builder.setManual(true);
    }
}
