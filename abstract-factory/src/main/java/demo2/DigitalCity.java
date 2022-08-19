package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:20:54
 * @Version: 1.0.1
 * @Description: 数码城
 */
public class DigitalCity {

    // 数码工厂
    private DigitalFactory factory;

    // 构造函数的方式注入数码工厂
    public DigitalCity(DigitalFactory factory) {
        this.factory = factory;
    }

    // 购买笔记本电脑
    public Book orderBook() {
        return factory.createBook();
    }

    // 购买手机
    public Phone orderPhone() {
        return factory.createPhone();
    }
}
