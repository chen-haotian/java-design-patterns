package demo1.components;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:47:12
 * @Version: v1.0.0
 * @Description: 汽车引擎
 */
public class Engine {

    /** 体积 */
    private final double volume;

    /** 里程 */
    private double mileage;

    /** 启动 */
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("无法转到（），必须先启动发动机！");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
