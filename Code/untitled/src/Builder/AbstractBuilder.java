package builder;

import engine.AbstractEngine;
import engine.DieselEngine;
import engine.ElectricalEngine;
import engine.EngineType;
import engine.NuclearEngine;

/**
 * The basis for all the different builders
 * setEngine uses an enum (found in engine.EngineType) for selecting the type of engine
 */
public abstract class AbstractBuilder implements Builder {

    protected int seats;
    protected boolean manual;
    protected AbstractEngine engine;

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setManual(boolean manual) {
        this.manual = manual;
    }

    @Override
    public void setEngine(EngineType engine) {
        switch (engine) {
            case DIESEL -> this.engine = new DieselEngine();
            case ELECTRICAL -> this.engine = new ElectricalEngine();
            case NUCLEAR -> this.engine = new NuclearEngine();
        }
    }
}
