package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:52:40
 * @Version: 1.0.0
 * @Description: 美式咖啡
 */
public class AmericanoCoffee extends Coffee {
    public AmericanoCoffee() {
        super.name = "美式咖啡";
    }

    @Override
    public void addMilk() {
        System.out.println("纯牛奶");
    }

    @Override
    public void addSugar() {
        System.out.println("5分糖");
    }
}
