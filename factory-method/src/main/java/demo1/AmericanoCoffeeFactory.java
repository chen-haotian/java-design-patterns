package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 21:44:22
 * @Version: 1.0.0
 * @Description: 美式咖啡工厂类
 */
public class AmericanoCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
