package demo4;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 17:59:51
 * @Version: 1.0.3
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog1 = new Dog("小白", 2, "白色");
        System.out.println(dog1.hashCode()); // 1975012498
        Person p1 = new Person("张三", 21, dog1);
        System.out.println(p1.hashCode()); // 1808253012
        System.out.println(p1);

        // 克隆
        Person p2 = (Person) p1.clone();
        Dog dog2 = p2.getDog();
        System.out.println(dog2.hashCode()); // 1975012498
        System.out.println(p2.hashCode()); // 589431969
        // 由此可见，对于引用数据类型是浅拷贝
        System.out.println(p2);
    }
}
