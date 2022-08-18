package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 21:52:37
 * @Version: TODO
 * @Description: TODO
 */
public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore(new AmericanoCoffeeFactory());
        Coffee coffee = coffeeStore.createCoffee();
        System.out.println(coffee.name);
    }
}
