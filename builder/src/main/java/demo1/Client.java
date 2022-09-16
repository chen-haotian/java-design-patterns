package demo1;

import demo1.builders.CarBuilder;
import demo1.builders.CarManualBuilder;
import demo1.cars.Car;
import demo1.cars.Manual;
import demo1.director.Director;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 21:00:42
 * @Version: v1.0.0
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个主管控制生成器【建造者的建造工程狮】
        Director director = new Director();

        // Director从客户端获取具体的生成器对象
        // （应用程序代码）。这是因为应用程序更清楚哪些
        // 用于获取特定产品的生成器。
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // 最终产品通常从构建器对象【Builder具体实现类对象】中检索
        // 因为建造者的建造工程狮不知道也不依赖于混凝土建筑商，以及产品。
        Car car = builder.getResult();
        System.out.println("汽车构建中【制造中】:\n" + car.getCarType().getCn());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // 建造者的建造工程狮可能知道一些建筑配方。
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n汽车说明书构建者中【制造中】:\n" + carManual.print());
    }
}
