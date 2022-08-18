package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 00:22:12
 * @Version: TODO
 * @Description: 美式咖啡工厂，专门用于美式咖啡的生产
 */
public class AmericanoCoffeeFactory implements CoffeeFactory {

    // 生产美式咖啡
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
