package com.human.factory.method;

/**
 * <>宝马工厂</>
 * @author human
 * @version V1.0
 * @Time 2020/4/25
 */
public class BaomaFactory implements CarFactory{
    @Override
    public Car getCar() {

        //do something  实现造宝马车的逻辑

        return new Baoma();
    }
}
