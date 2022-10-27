package builder;

import car.TeslaCar;
import engine.EngineType;

/**
 * builds a TeslaCar
 * Uses the an enum (found in engine.EngineType) to check that someone doesn't try to add
 * a diesel engine to a Tesla
 */
public class BuilderTesla extends AbstractBuilder {

    @Override
    public void setEngine(EngineType engine) {
        if (engine == EngineType.DIESEL) {
            throw new IllegalArgumentException("Tesla is not allowed to have a diesel-engine.");
        }
        super.setEngine(engine);
    }

    public TeslaCar build(){
        return new TeslaCar(this.engine, this.seats, this.manual);
    }
}
