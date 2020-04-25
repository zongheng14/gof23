package com.human.factory.method;

/**
 * <>奔驰</>
 * 实现Car接口
 *
 * @author human
 * @version V1.0
 * @Time 2020/4/25
 */
public class Benze implements Car {
    @Override
    public void name() {
        System.out.println("奔驰工厂，把车造好了，返回给用户");
    }
}
