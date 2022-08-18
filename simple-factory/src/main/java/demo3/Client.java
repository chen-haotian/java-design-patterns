package demo3;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:58:06
 * @Version: 1.0.2
 * @Description: 客户端【使用方】
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        // 根据入参咖啡类型制造咖啡
        // Coffee coffee = coffeeStore.orderCoffee("latte");
        Coffee coffee = coffeeStore.orderCoffee("americano");
        System.out.println(coffee);
    }
}
