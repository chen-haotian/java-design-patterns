package hungrysingleton.demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 15:46:31
 * @Version: 1.0.0
 * @Description: 单例设计模式【饿汉模式 - 方式1】线程安全
 */
public class Singleton {

    /** 初始化该类【单例类】实例化对象
     * 并使用static修饰【标记成静态变量，随着类加载，解决线程安全问题】
     * 并使用final关键字修饰，保证该类的实例不能被修改
     */
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 私有化该类【单例类】构造方法
     */
    private Singleton() {

    }

    /**
     * 对使用方提供全局获取该类实例对象的方法
     *
     * @return Singleton类的实例对象
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
