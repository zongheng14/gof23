package com.human.factory.abstractFactory;

/**
 * <>华为手机类</>
 */
public class HuaweiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("华为-手机-开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为-手机-关机");
    }

    @Override
    public void call() {
        System.out.println("华为-手机-打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为-手机-发短信");
    }
}
