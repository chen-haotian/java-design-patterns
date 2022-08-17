package destruction.demo2;

import cas.Singleton;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 21:55:54
 * @Version: TODO
 * @Description: TODO
 */
public class SingletonTest {

    /**
     * 采用反射技术破坏单例设计模式
     */
    @Test
    public void reflex() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Singleton instance = Singleton.getInstance();
        // 获取Singleton类的Class对象
        Class<? extends Singleton> aClass = instance.getClass();
        // 获取Singleton类的无参数构造函数
        Constructor<? extends Singleton> constructor = aClass.getDeclaredConstructor();
        // 设置访问权限
        constructor.setAccessible(true);
        // 反射创建实例对象
        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);
    }
}
