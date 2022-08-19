package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-19 16:33:35
 * @Version: 1.0.1
 * @Description: 手机抽象类
 */
public abstract class Phone extends Digital {

    /** 名称 */
    protected String name;

    /** 基本打印信息 */
    public abstract void show();
}
