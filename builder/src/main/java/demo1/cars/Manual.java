package demo1.cars;

import demo1.components.Engine;
import demo1.components.GPSNavigator;
import demo1.components.Transmission;
import demo1.components.TripComputer;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:41:57
 * @Version: v1.0.0
 * @Description: 手册产品
 */
public class Manual {

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

    /** GPS导航 */
    private GPSNavigator gpsNavigator;

    /**
     * 构造初始化对象
     *
     * @param carType
     * @param seats
     * @param engine
     * @param transmission
     * @param tripComputer
     * @param gpsNavigator
     */
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * 输出基本信息
     *
     * @return
     */
    public String print() {
        String info = "";
        info += "汽车类型: " + carType.getCn() + "\n";
        info += "座位数: " + seats + "\n";
        info += "汽车引擎: 体积 - " + engine.getVolume() + "; 里程数 - " + engine.getMileage() + "\n";
        info += "变数箱: " + transmission.getCn() + "\n";
        if (this.tripComputer != null) {
            info += "汽车仪表盘：功能正常" + "\n";
        } else {
            info += "汽车仪表盘：不适用" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS导航器：功能正常" + "\n";
        } else {
            info += "GPS导航器: 不适用" + "\n";
        }
        return info;
    }
}
