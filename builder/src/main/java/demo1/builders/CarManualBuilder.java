package demo1.builders;

import demo1.cars.CarType;
import demo1.cars.Manual;
import demo1.components.Engine;
import demo1.components.GPSNavigator;
import demo1.components.Transmission;
import demo1.components.TripComputer;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:37:45
 * @Version: v1.0.0
 * @Description: 汽车手册生成器
 */
public class CarManualBuilder implements Builder {

    /** 汽车类型 */
    private CarType type;

    /** 汽车多少个座位 */
    private int seats;

    /** 汽车引擎 */
    private Engine engine;

    /** 汽车变速器 */
    private Transmission transmission;

    /** 汽车仪表盘 */
    private TripComputer tripComputer;

    /** GPS导航器 */
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
