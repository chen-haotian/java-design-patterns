package demo2;

/**
 * @Author: Matrix
 * @Date: 2022-09-03 16:26:30
 * @Version: v1.0.1
 * @Description: ofo自行车构建者
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("橡胶车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶座椅");
    }

    @Override
    public void buildWheel() {
        bike.setWheel("中级轮胎");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
