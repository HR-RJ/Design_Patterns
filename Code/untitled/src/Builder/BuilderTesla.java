package Builder;

import Car.LadaCar;
import Car.TeslaCar;
import Engine.AbstractEngine;
import Engine.DieselEngine;
import Engine.ElectricalEngine;
import Engine.NuclearEngine;

public class BuilderTesla implements Builder {

    private int seats;
    private Boolean manual;
    private AbstractEngine engine;


    public void setSeats(int _seats) {
        this.seats= _seats;
    }

    public void setManual(Boolean _manual) {
        this.manual = _manual;
    }

    public void setEngine(String _engine) {
        switch(_engine) {
            case "Electric":
                this.engine = new ElectricalEngine();
                break;
            case "Nuclear":
                this.engine = new NuclearEngine();
                break;
        }
    }

    public TeslaCar returnCar(){
        return new TeslaCar(this.engine, this.seats, this.manual);
    }
}