package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 21:45:48
 * @Version: 1.0.0
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    /** 定义咖啡工厂成员变量 */
    public CoffeeFactory coffeeFactory;

    /**
     * 构造方法的方式注入咖啡工厂成员变量
     *
     * @param coffeeFactory 咖啡工厂成员变量
     */
    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    /**
     * 创建咖啡
     * @return
     */
    public Coffee createCoffee() {
        return coffeeFactory.createCoffee();
    }
}
