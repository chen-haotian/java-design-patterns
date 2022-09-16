package demo1.cars;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:44:58
 * @Version: v1.0.0
 * @Description: 汽车类型
 */
public enum CarType {

    // 城市汽车
    CITY_CAR("CITY_CAR", "城市汽车"),

    // 跑车
    SPORTS_CAR("SPORTS_CAR", "跑车"),

    // 运动型多用途汽车
    SUV("SUV", "运动型多用途汽车");

    // 英文
    private String en;

    // 简体中文
    private String cn;

    // 构造赋值枚举变量
    CarType(String en, String cn) {
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
