package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:55:10
 * @Version: 1.0.1
 * @Description: 奔驰车工厂
 */
public class BenzFactory extends CarFactory<Benz> { //将奔驰车类工厂抽象为抽象类，添加泛型T由子类指定奔驰车类类型

    // 生产奔驰车
    @Override
    public Car createCar() {
        return new Benz("奔驰车");
    }
}
