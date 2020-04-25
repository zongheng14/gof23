package com.human.factory.abstractFactory;

/**
 * <>路由器产品接口</>
 */
public interface IRouteProduct {
    //路由器拥有的通用功能

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * WiFi
     */
    void openWIFI();

    /**
     * 设置
     */
    void setting();

}
