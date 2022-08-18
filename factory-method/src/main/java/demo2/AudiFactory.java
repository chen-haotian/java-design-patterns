package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:57:31
 * @Version: 1.0.1
 * @Description: 奥迪车工厂
 */
public class AudiFactory extends CarFactory<Audi> { //将奥迪车类工厂抽象为抽象类，添加泛型T由子类指定奥迪车类类型

    // 生产奥迪车
    @Override
    public Car createCar() {
        return new Audi("奥迪车");
    }
}
