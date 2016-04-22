package simpleFactory;

/**
 * @Title: Factory
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 11:36
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Factory {

    // 第一种
    public static Car getCarInstance() {
        return new Ford();
    }

    // 第二种
    public static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        } else if ("Ford".equals(type)) {
            c = new Ford();
        }
        return c;
    }

    // 第三种
    public static Car getCarInstance(Class c) {
        Car car = null;
        try {
            car = (Car) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
