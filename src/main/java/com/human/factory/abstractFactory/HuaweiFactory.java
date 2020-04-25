package com.human.factory.abstractFactory;

/**
 * <>华为工厂</>
 */
public class HuaweiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouteProduct irouteProduct() {
        return new HuaweiRoute();
    }
}
