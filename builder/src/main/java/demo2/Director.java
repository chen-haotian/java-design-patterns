package demo2;

/**
 * @Author: Matrix
 * @Date: 2022-09-03 20:34:44
 * @Version: v1.0.1
 * @Description: 构建指挥者
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 用于构建复杂对象
     * @return
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        builder.buildWheel();
        return builder.createBike();
    }
}
