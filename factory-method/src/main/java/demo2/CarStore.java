package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:58:30
 * @Version: 1.0.1
 * @Description: 汽车店类
 */
public class CarStore {

    /** 定义汽车工厂成员变量 */
    private CarFactory factory;

    /**
     * 构造函数的方式注入汽车工厂成员变量
     *
     * @param factory 汽车工厂
     */
    public CarStore(CarFactory factory) {
        this.factory = factory;
    }

    /**
     * 从工厂获取到汽车进行销售
     *
     * @return Car抽象类的实现类对象
     */
    public Car orderCar() {
        return factory.createCar();
    }
}
