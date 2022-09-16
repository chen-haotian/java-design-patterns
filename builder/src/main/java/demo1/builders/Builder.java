package demo1.builders;

import demo1.cars.CarType;
import demo1.components.Engine;
import demo1.components.GPSNavigator;
import demo1.components.Transmission;
import demo1.components.TripComputer;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:28:17
 * @Version: v1.0.0
 * @Description: 通用生成器接口
 */
public interface Builder {

    /** 汽车类型 */
    void setCarType(CarType type);

    /** 汽车多少个座位 */
    void setSeats(int seats);

    /** 汽车引擎 */
    void setEngine(Engine engine);

    /** 汽车变速器 */
    void setTransmission(Transmission transmission);

    /** 汽车仪表盘 */
    void setTripComputer(TripComputer tripComputer);

    /** GPS导航器 */
    void setGPSNavigator(GPSNavigator gpsNavigator);
}