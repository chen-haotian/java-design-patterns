package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:51:50
 * @Version: 1.0.1
 * @Description: 车抽象类工厂
 */
public abstract class CarFactory<T extends Car> {  //将车类工厂抽象为抽象类，添加泛型T由子类指定车类类型

    public abstract Car createCar();
}
