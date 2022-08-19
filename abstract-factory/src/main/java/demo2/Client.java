package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:19:39
 * @Version: 1.0.1
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) {
        // 购买Apple产品
        // 创建Apple产品的数码工厂
        // AppleFactory factory = new AppleFactory();

        // 购买Huawei产品
        // 创建Huawei产品的数码工厂
        HuaweiFactory factory = new HuaweiFactory();

        // 创建数码城对象
        DigitalCity digitalCity = new DigitalCity(factory);
        Book book = digitalCity.orderBook();
        Phone phone = digitalCity.orderPhone();
        System.out.println(book);
        System.out.println(phone);
    }
}
