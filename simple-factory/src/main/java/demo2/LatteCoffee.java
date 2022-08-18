package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:50:13
 * @Version: 1.0.1
 * @Description: 拿铁咖啡
 */
public class LatteCoffee extends Coffee {
    public LatteCoffee() {
        super.name = "拿铁咖啡";
    }

    @Override
    public void addMilk() {
        System.out.println("牛奶");
    }

    @Override
    public void addSugar() {
        System.out.println("7分糖");
    }
}
