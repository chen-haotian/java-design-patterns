package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 02:47:12
 * @Version: 1.0.0
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // sheep就是原型
        Sheep sheep = new Sheep("多利", 3);
        System.out.println(sheep);
        // 开始克隆
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep1);
        // 对比一下hashCode值，看两个对象指向堆内存的地址指针是否是同一个
        System.out.println(sheep.hashCode()); // 1975012498
        System.out.println(sheep1.hashCode()); // 1808253012
        // 对比hashCode值，证明克隆出来的是深拷贝
    }
}
