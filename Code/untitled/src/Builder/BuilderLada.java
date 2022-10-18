package Builder;

import Car.Engine;
import Car.LadaCar;

public class BuilderLada implements Builder {
    private int seats;
    private Boolean manual;
    private Engine engine;


    public void setSeats(int _seats) {
        this.seats= _seats;
    }

    public void setManual(Boolean _manual) {
        this.manual = _manual;
    }

    public void setEngine(Engine _engine) {
        this.engine = _engine;
    }

    public LadaCar returnCar(){
        return new LadaCar(this.engine);
    }
}
