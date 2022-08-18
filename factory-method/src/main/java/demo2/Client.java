package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 04:01:15
 * @Version: 1.0.1
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        // 多态的方式创建奥迪汽车工厂
        CarFactory audiFactory = new AudiFactory();
        // 创建汽车店对象，汽车店需要从工厂拿到汽车
        CarStore carStore = new CarStore(audiFactory);
        Car car = carStore.orderCar();
        System.out.println(car);
    }
}
