package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 03:46:19
 * @Version: 1.0.1
 * @Description: 车抽象类
 */
public abstract class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 输出一下车的信息
    @Override
    public String toString() {
        return name + "@" + hashCode();
    }
}
