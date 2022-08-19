package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:15:21
 * @Version: 1.0.1
 * @Description: Apple数码工厂
 */
public class AppleFactory extends DigitalFactory<Digital> {

    @Override
    public Phone createPhone() {
        return new IPhone("iphone 14 Pro Max");
    }

    @Override
    public Book createBook() {
        return new MacBook("MacBook Pro 2022");
    }
}
