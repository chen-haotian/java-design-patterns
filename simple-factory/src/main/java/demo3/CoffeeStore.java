package demo3;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:53:48
 * @Version: 1.0.2
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    /**
     * 根据咖啡类型制造咖啡
     *
     * @param type 咖啡类型【latte、americano】
     * @return Coffee子类对象
     */
    public Coffee orderCoffee(String type) {
        // 创建咖啡工厂对象
        // CoffeeFactory coffeeFactory = new CoffeeFactory();
        // 调用生产咖啡方法
        // return coffeeFactory.createCoffee(type);

        // 由于CoffeeFactory是静态工厂，可以直接通过类名调用
        return CoffeeFactory.createCoffee(type);
    }
}
