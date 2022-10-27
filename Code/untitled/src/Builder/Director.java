package builder;

import engine.EngineType;

/**
 * has the structure for all the models the carDealership provides
 */
public class Director {
    public void buildLadaA(Builder builder) { //family
        builder.setEngine(EngineType.DIESEL);
        builder.setSeats(4);
        builder.setManual(false);
    }
    public void buildLadaB(Builder builder) { //sports
        builder.setEngine(EngineType.NUCLEAR);
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildTeslaA(Builder builder) { //Model X
        builder.setEngine(EngineType.ELECTRICAL);
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildTeslaB(Builder builder) { //roadster
        builder.setEngine(EngineType.ELECTRICAL);
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildToyotaA(Builder builder) { //family
        builder.setEngine(EngineType.DIESEL);
        builder.setSeats(2);
        builder.setManual(true);
    }

    public void buildToyotaB(Builder builder) { //sports
        builder.setEngine(EngineType.ELECTRICAL);
        builder.setSeats(2);
        builder.setManual(true);
    }
}
