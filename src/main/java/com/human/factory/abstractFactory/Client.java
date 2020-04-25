package com.human.factory.abstractFactory;

/**
 * 抽象工厂模式：
 *  即 工厂的工厂，抽象的抽象，
 *
 */
public class Client {

    public static void main(String[] args) {

        //小米
        System.out.println("-------------小米工厂-----------------");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct xiaomiiPhoneProduct = xiaomiFactory.iphoneProduct();
        xiaomiiPhoneProduct.call();
        xiaomiiPhoneProduct.sendSMS();

        IRouteProduct xiaomiiRouteProduct = xiaomiFactory.irouteProduct();
        xiaomiiRouteProduct.start();
        xiaomiiRouteProduct.openWIFI();

        //华为
        System.out.println("-------------华为工厂-----------------");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IPhoneProduct huaweiiPhoneProduct = huaweiFactory.iphoneProduct();
        huaweiiPhoneProduct.call();
        huaweiiPhoneProduct.sendSMS();

        IRouteProduct huaweiiRouteProduct = huaweiFactory.irouteProduct();
        huaweiiRouteProduct.start();
        huaweiiRouteProduct.openWIFI();


    }
}
