package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:53:48
 * @Version: 1.0.1
 * @Description: 咖啡店
 */
public class CoffeeStore {

    /** 定义咖啡简单工厂成员变量 */
    private CoffeeFactory coffeeFactory;

    /**
     * 通过构造的方式注入咖啡简单工厂成员变量
     * @param coffeeFactory 咖啡简单工厂成员变量
     */
    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    /**
     * 根据咖啡类型创建咖啡
     * @param type 咖啡类型【latte、americano】
     * @return
     */
    public Coffee createCoffee(String type) {
        return coffeeFactory.createCoffee(type);
    }
}
