package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 00:27:34
 * @Version: 1.0.0
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    /** 定义咖啡工厂成员变量 */
    private CoffeeFactory factory;

    /**
     * 使用构造函数的方式注入咖啡工厂成员变量
     *
     * @param factory 咖啡工厂接口实现类对象
     */
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * 制造咖啡
     *
     * @return Coffee抽象类的具体实现类的对象
     */
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        // 咖啡配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
