package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:17:17
 * @Version: 1.0.1
 * @Description: 华为数码工厂
 */
public class HuaweiFactory extends DigitalFactory<Digital> {

    @Override
    public Phone createPhone() {
        return new HuaweiMate50Pro("Huawei Mate50 Pro");
    }

    @Override
    public Book createBook() {
        return new MateBook("Huawei MateBook 2022");
    }
}
