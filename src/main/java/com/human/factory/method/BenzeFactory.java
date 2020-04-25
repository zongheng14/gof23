package com.human.factory.method;

/**
 * <>奔驰工厂</>
 *
 * @author human
 * @version V1.0
 * @Time 2020/4/25
 */
public class BenzeFactory implements CarFactory{
    @Override
    public Car getCar() {

        //do something 实现造奔驰车的逻辑

        return new Benze();
    }
}
