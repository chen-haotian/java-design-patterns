package lazysingleton.demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 16:48:54
 * @Version: TODO
 * @Description: TODO 单例设计模式【懒汉模式 - 方式2】 线程安全
 */
public class Singleton {

    /** 声明对象实例成员变量 */
    private static Singleton instance;

    /**
     * 私有化该类【单例类】构造方法
     */
    private Singleton() {

    }

    /**
     * 对使用方提供全局获取该类实例对象的方法
     * synchronized关键字修饰，会保证使用方只有一个线程可以操作
     *
     * @return Singleton类的实例对象
     */
    public synchronized static Singleton getInstance() {
        // 对象实例不为null直接返回
        if (instance != null) return instance;
        // 对象实例为null时才去创建
        instance = new Singleton();
        return instance;
    }
}
