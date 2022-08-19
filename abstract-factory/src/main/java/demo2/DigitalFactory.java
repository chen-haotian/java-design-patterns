package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:10:19
 * @Version: 1.0.1
 * @Description: 数码产品工厂
 */
public abstract class DigitalFactory<T extends Digital> {

    /** 生产手机 */
    public abstract Phone createPhone();

    /** 生产笔记本电脑 */
    public abstract Book createBook();
}
