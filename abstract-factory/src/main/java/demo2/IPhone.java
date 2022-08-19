package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 16:55:51
 * @Version: 1.0.1
 * @Description: 苹果手机
 */
public class IPhone extends Phone {

    public IPhone(String name) {
        super.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name + "@" + this.hashCode());
    }
}
