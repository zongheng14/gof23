package com.human.factory.abstractFactory;

/**
 * <>小米工厂</>
 */
public class XiaomiFactory implements IProductFactory {

    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouteProduct irouteProduct() {
        return new XiaomiRoute();
    }
}
