package builder;

import car.ToyotaCar;

public class BuilderToyota extends AbstractBuilder {

    @Override
    public ToyotaCar build(){
        return new ToyotaCar(this.engine, this.seats, this.manual);
    }
}
