package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:53:48
 * @Version: 1.0.0
 * @Description: 咖啡店
 */
public class CoffeeStore {

    /**
     * 根据咖啡类型创建咖啡
     * @param type 咖啡类型【latte、americano】
     * @return
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
