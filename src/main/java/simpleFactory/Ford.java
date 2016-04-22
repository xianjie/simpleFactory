package simpleFactory;

/**
 * @Title: Ford
 * @Description:
 * @author: xian jie
 * @date: 2016/1/27 11:36
 * 杭州尚尚签网络科技有限公司
 * @version: 2.0
 */
public class Ford implements Car {
    public void run() {
        System.out.println("Ford开始启动了。。。。");
    }

    public void stop() {
        System.out.println("Ford停车了。。。。");
    }
}
