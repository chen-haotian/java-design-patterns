package demo1;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 02:46:01
 * @Version: 1.0.0
 * @Description: 羊类
 */
public class Sheep implements Cloneable {

    private String name;

    private Integer age;

    public Sheep(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 重写Cloneable接口的clone()方法
     *
     * @return Sheep类实例对象
     * @throws CloneNotSupportedException 不支持克隆异常
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        System.out.println("具体的原型对象创建完成!");
        return (Sheep) super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
