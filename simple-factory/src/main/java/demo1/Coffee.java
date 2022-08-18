package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:47:31
 * @Version: 1.0.0
 * @Description: 咖啡抽象类
 */
public abstract class Coffee {

    // 咖啡名称
    protected String name;

    // 加奶
    public abstract void addMilk();

    // 加糖
    public abstract void addSugar();
}
