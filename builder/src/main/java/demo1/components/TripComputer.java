package demo1.components;

import demo1.cars.Car;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:53:18
 * @Version: v1.0.0
 * @Description: 汽车仪表盘
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("燃油油位：" + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("汽车启动了");
        } else {
            System.out.println("汽车未启动");
        }
    }
}
