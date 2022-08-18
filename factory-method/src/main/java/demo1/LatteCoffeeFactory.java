package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 00:26:00
 * @Version: 1.0.0
 * @Description: 拿铁咖啡工厂，专门用于拿铁咖啡的生产
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    // 生产拿铁咖啡
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
