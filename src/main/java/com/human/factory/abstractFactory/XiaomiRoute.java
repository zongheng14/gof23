package com.human.factory.abstractFactory;

/**
 * <>小米路由类</>
 */
public class XiaomiRoute implements IRouteProduct{
    @Override
    public void start() {
        System.out.println("小米-路由-开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米-路由-关机");
    }

    @Override
    public void openWIFI() {
        System.out.println("小米-路由-打开WIFI");
    }

    @Override
    public void setting() {
        System.out.println("小米-路由-设置参数");
    }
}
