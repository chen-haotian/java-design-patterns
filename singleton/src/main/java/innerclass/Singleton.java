package innerclass;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 17:08:01
 * @Version: TODO
 * @Description: TODO 单例设计模式【静态内部类 - 方式1】 线程安全
 */
public class Singleton {

    /**
     * 私有化该类【单例类】构造方法
     */
    private Singleton() {

    }

    /**
     * 静态内部类的方式实例化对象
     */
    private static class SingletonHandler {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 对使用方提供全局获取该类实例对象的方法
     *
     * @return Singleton类的实例对象
     */
    public static Singleton getInstance() {
        return SingletonHandler.INSTANCE;
    }
}
