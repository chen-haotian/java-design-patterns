package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 17:08:06
 * @Version: 1.0.1
 * @Description: 华为笔记本电脑
 */
public class MateBook extends Book {

    public MateBook(String name) {
        super.name = name;
    }

    @Override
    public void show() {
        System.out.println(this.name + "@" + this.hashCode());
    }
}
