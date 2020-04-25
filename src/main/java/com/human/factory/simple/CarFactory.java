package com.human.factory.simple;

/**
 * <>汽车工厂类</>
 * <p>
 * 使用该工厂统一的创建汽车
 *
 * @author human
 * @version V1.0
 * @Time 2020/4/25
 */
public class CarFactory {

    /**
     * 消费者想买车，只需要给工厂一个车的名字，工厂就返回给消费者一辆对应的车，没有就返回null.
     */
    public static Car getCar(String carName) {

        //实现造宝马车的逻辑
        if (carName.equals("宝马")) {
            return new Baoma();
        }

        //实现造奔驰车的逻辑
        if (carName.equals("奔驰")) {
            return new Benze();
        }

        //增加买捷达车的逻辑


        //客户要买这车 我这实在整不出来，给个null吧
        return null;
    }
}
