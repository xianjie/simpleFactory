package simpleFactory;

/**
 * @Title: SimpleFactoryTest
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 11:43
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        // 第一种
        Car c = Factory.getCarInstance();
        c.run();
        c.stop();

        // 第二种
        c = Factory.getCarInstance("Ford");
        c.run();
        c.stop();

        // 第三种
        c = Factory.getCarInstance(Benz.class);
        c.run();
        c.stop();

    }
}
