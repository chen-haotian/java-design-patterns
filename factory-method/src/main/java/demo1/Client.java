package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:35:18
 * @Version: 1.0.0
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        // 创咖啡工厂使用多态的方式
        // CoffeeFactory coffeeFactory = new AmericanoCoffeeFactory(); // 美式咖啡工厂
        CoffeeFactory coffeeFactory = new LatteCoffeeFactory(); // 拿铁咖啡工厂
        // 创建咖啡店对象，咖啡店对象构造需要指定一个咖啡工厂
        CoffeeStore coffeeStore = new CoffeeStore(coffeeFactory);
        // 咖啡店制作出来的咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee);
    }
}
