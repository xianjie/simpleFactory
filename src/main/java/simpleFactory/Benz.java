package simpleFactory;

/**
 * @Title: Benz
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 11:35
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Benz implements Car {

    public void run() {
        System.out.println("Benz开始启动了。。。。");
    }

    public void stop() {
        System.out.println("Benz停车了。。。。");
    }
}
