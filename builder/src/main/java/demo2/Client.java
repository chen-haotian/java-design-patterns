package demo2;

/**
 * @Author: Matrix
 * @Date: 2022-09-02 17:29:21
 * @Version: v1.0.1
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new HelloBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
        System.out.println(bike.getWheel());
    }
}
