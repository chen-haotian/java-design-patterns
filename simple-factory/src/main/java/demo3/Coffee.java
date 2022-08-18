package demo3;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-18 15:47:31
 * @Version: 1.0.2
 * @Description: 咖啡抽象类
 */
public abstract class Coffee {

    // 咖啡名称
    protected String name;

    // 加奶
    public void addMilk() {
        System.out.println("加奶");
    }

    // 加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    // toString方法，格式化一下字符串对象形式
    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }
}
