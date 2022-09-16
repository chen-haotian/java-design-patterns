package demo1.components;

/**
 * @Author: Matrix
 * @Date: 2022-09-16 20:49:35
 * @Version: v1.0.0
 * @Description: GPS导航器
 */
public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "地球村xxx街道xxx路xxx号";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
