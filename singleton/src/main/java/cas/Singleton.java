package cas;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 17:17:00
 * @Version: TODO
 * @Description: TODO 单例设计模式【CAS - 方式1】 线程安全
 */
public class Singleton /*implements Serializable*/ {

    /** AtomicReference可以封装一个V实例，保证原子性操作 */
    private static final AtomicReference<Singleton> atomicReference = new AtomicReference<>();

    /**
     * 私有化该类【单例类】构造方法
     */
    private Singleton() {
        // 判断对象存在就抛出异常
        if (atomicReference.get() != null) {
            throw new RuntimeException("对象以实例化");
        }
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式
     * @return
     */
    // private Object readResolve() {
    //     return getInstance();
    // }

    /**
     * 对使用方提供全局获取该类实例对象的方法
     *
     * @return Singleton类的实例对象
     */
    public static Singleton getInstance() {
        // 一直获取AtomicReference对象里面封装的实例V
        while (true) {
            Singleton singleton = atomicReference.get();
            if (singleton != null) return singleton;
            // 对象为null就创建对象
            // compareAndSet()方法
            // 第一个参数expect: 预期值
            // 第一个参数update: 更新值
            atomicReference.compareAndSet(null, new Singleton());
            return atomicReference.get();
        }
    }
}
