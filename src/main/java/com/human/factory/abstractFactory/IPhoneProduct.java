package com.human.factory.abstractFactory;

/**
 * <>手机产品接口</>
 */
public interface IPhoneProduct {

    //手机拥有的通用功能

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 打电话
     */
    void call();

    /**
     * 发短信
     */
    void sendSMS();
}
