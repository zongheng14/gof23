package com.human.factory.abstractFactory;

/**
 * <>小米手机类</>
 */
public class XiaomiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("小米-手机-开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米-手机-关机");
    }

    @Override
    public void call() {
        System.out.println("小米-手机-打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米-手机-发短信");
    }
}
