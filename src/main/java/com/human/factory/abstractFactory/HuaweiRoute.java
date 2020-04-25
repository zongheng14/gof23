package com.human.factory.abstractFactory;

/**
 * <>华为手机</>
 */
public class HuaweiRoute implements IRouteProduct{
    @Override
    public void start() {
        System.out.println("华为-路由-开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为-路由-关机");
    }

    @Override
    public void openWIFI() {
        System.out.println("华为-路由-打开WIFI");
    }

    @Override
    public void setting() {
        System.out.println("华为-路由-设置参数");
    }
}
