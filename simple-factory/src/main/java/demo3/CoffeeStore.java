package demo3;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:53:48
 * @Version: 1.0.1
 * @Description: 咖啡店
 */
public class CoffeeStore {

    /**
     * 根据咖啡类型创建咖啡
     * @param type 咖啡类型【latte、americano】
     * @return
     */
    public Coffee createCoffee(String type) {
        // 由于CoffeeFactory是静态工厂，可以直接通过类名调用
        return CoffeeFactory.createCoffee(type);
    }
}
