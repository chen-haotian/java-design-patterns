package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 21:41:57
 * @Version: 1.0.0
 * @Description: 拿铁咖啡类
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
