package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 16:59:36
 * @Version: 1.0.1
 * @Description: 华为手机
 */
public class HuaweiPhone extends Phone {

    public HuaweiPhone(String name) {
        super.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name + "@" + this.hashCode());
    }
}
