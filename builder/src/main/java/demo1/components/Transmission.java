package demo1.components;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:51:06
 * @Version: v1.0.0
 * @Description: 变速器
 */
public enum Transmission {

    // 单速
    SINGLE_SPEED("SINGLE_SPEED", "单速"),

    // 手动
    MANUAL("MANUAL", "手动"),

    // 自动
    AUTOMATIC("AUTOMATIC", "自动"),

    // 半自动
    SEMI_AUTOMATIC("SEMI_AUTOMATIC", "半自动");

    // 英文
    private String en;

    // 简体中文
    private String cn;

    // 构造赋值枚举变量
    Transmission(String en, String cn) {
        this.en = en;
        this.cn = cn;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
}
