package destruction.demo1;

import cas.Singleton;
import org.junit.Test;

import java.io.*;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-17 17:30:25
 * @Version: TODO
 * @Description: TODO 模拟破坏单利模式
 */
public class SingletonTest {

    /**
     * 序列化的方式破话单例模式
     *
     */
    @Test
    public void serializeTest() {
        Singleton instance = Singleton.getInstance();
        String filePath = "./file/object.txt";
        // readObject2File(instance, filePath);

        Singleton instance1 = writeObject2File(filePath);
        Singleton instance2 = writeObject2File(filePath);
        System.out.println(instance1 == instance2); // 结果为false
    }

    /**
     * 将示例对象序列化到文本文件上
     *
     * @param object 实例化对象
     * @param filePath 序列化文件路径
     */
    public void readObject2File(Object object, String filePath) {
        try {
            // 创建对象输出流
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            // 将instance对象写出到文件中
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     */
    public Singleton writeObject2File(String filePath) {
        try {
            // 创建对象输入流对象
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            // 第一个读取Singleton对象
            return (Singleton) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
