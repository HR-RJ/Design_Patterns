package builder;

import car.AbstractCar;
import engine.EngineType;

public interface Builder {
    void setSeats(int seats);
    void setManual(boolean manual);
    void setEngine(EngineType engine);
    AbstractCar build();
}
