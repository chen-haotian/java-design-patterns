package doublecheck;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 16:57:25
 * @Version: TODO
 * @Description: TODO 单例设计模式【双重校验锁模式 - 方式1】 线程安全
 */
public class Singleton {

    /**
     * 声明对象实例成员变量
     * volatile关键字保证底层指令执行顺序
     */
    private static volatile Singleton instance;

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
        // 第一次校验，如果instance不为null，不进入抢锁阶段，直接返回实例
        if (instance == null) {
            // 上锁
            synchronized (Singleton.class) {
                // 调用者抢到锁之后再第二次校验，对象示例是否为null
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
