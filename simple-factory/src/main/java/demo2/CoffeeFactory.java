package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 22:55:56
 * @Version: 1.0.1
 * @Description: 咖啡工厂类
 */
public class CoffeeFactory {

    /**
     * 根据咖啡类型制造咖啡
     *
     * @param type 咖啡类型【latte、americano】
     * @return Coffee子类对象
     */
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else if ("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
