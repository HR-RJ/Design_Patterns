package builder;

import car.LadaCar;

public class BuilderLada extends AbstractBuilder {

    @Override
    public LadaCar build(){
        return new LadaCar(this.engine, this.seats, this.manual);
    }
}
