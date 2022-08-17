package lazysingleton.demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 16:42:04
 * @Version: TODO
 * @Description: 单例设计模式【懒汉模式 - 方式1】 线程不安全
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
     *
     * @return Singleton类的实例对象
     */
    public static Singleton getInstance() {
        // 对象实例不为null直接返回
        if (instance != null) return instance;
        // 对象实例为null时才去创建
        instance = new Singleton();
        return instance;
    }
}
