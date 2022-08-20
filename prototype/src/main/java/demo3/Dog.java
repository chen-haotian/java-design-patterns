package demo3;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 17:58:39
 * @Version: 1.0.2
 * @Description: 狗类
 */
public class Dog implements Cloneable {

    private String name;

    private Integer age;

    private String color;

    // 有参数构造方法
    public Dog(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 重写 clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Dog 实例对象克隆成功");
        return super.clone();
    }

    // 重写 toString方法
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
