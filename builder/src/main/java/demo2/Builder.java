package demo2;


/**
 * @Author: Matrix
 * @Date: 2022-09-02 18:44:46
 * @Version: v1.0.1
 * @Description: 构建者抽象类
 */
public abstract class Builder {

    // 定义一个具体产品类成员变量
    protected Bike bike = new Bike();

    // 构建自行车架子
    public abstract void buildFrame();

    // 自行车座
    public abstract void buildSeat();

    // 自行车轮胎
    public abstract void buildWheel();

    // 构建自行车
    public abstract Bike createBike();
}
