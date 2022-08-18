package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 21:41:23
 * @Version: 1.0.0
 * @Description: 拿铁咖啡工厂类
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
