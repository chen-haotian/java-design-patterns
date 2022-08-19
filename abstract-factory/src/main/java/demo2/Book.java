package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 16:52:41
 * @Version: 1.0.1
 * @Description: 笔记本电脑抽象接口
 */
public abstract class Book extends Digital {

    /** 名称 */
    protected String name;

    /** 基本打印信息 */
    public abstract void show();
}
