package demo2;

/**
 * @Author: Matrix
 * @Date: 2022-09-02 18:58:10
 * @Version: v1.0.1
 * @Description: 哈罗自信车构建者
 */
public class HelloBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("碳纤维座椅");
    }

    @Override
    public void buildWheel() {
        bike.setWheel("高级轮胎");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
