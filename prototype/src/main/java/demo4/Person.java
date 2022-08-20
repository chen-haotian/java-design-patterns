package demo4;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 17:58:08
 * @Version: 1.0.3
 * @Description: 人类
 */
public class Person implements Cloneable {

    private String name;

    private Integer age;

    private Dog dog;

    // 构造方法
    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    // set/get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    // 重写 clone()方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Person 实例对象克隆成功");
        Person person = (Person) super.clone();
        person.dog = (Dog) person.dog.clone();
        return person;
    }

    // 重写 toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
