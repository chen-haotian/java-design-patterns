package demo1.cars;

import demo1.components.Engine;
import demo1.components.GPSNavigator;
import demo1.components.Transmission;
import demo1.components.TripComputer;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:38:55
 * @Version: v1.0.0
 * @Description: 汽车产品
 */
public class Car {

    /** 汽车类型 */
    private CarType carType;

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

    /** 燃料 */
    private double fuel = 0;

    /**
     * 构造初始化汽车产品对象
     *
     * @param carType
     * @param seats
     * @param engine
     * @param transmission
     * @param tripComputer
     * @param gpsNavigator
     */
    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
