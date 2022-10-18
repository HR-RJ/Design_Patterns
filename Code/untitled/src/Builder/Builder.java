package Builder;

import Car.Engine;

public interface Builder {
    void setSeats(int _seats);
    void setManual(Boolean _manual);
    void setEngine(Engine _engine);
}
