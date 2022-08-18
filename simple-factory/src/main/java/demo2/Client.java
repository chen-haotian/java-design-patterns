package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:58:06
 * @Version: 1.0.1
 * @Description: 客户端【使用方】
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个咖啡工厂对象
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        // 创建一个咖啡店对象，通过构造函数的方式，给咖啡店设置工厂
        CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
        // 根据入参咖啡类型创建咖啡
        // Coffee coffee = coffeeStore.createCoffee("latte");
        Coffee coffee = coffeeStore.createCoffee("americano");
        System.out.println(coffee.name);
        coffee.addMilk();
        coffee.addSugar();
    }
}
