package com.human.factory.method;

/**
 * <> 宝马车</>
 *
 * @author huamn
 * @version V1.0
 * @Time 2020/4/25
 */
public class Baoma implements Car{
    @Override
    public void name() {
        System.out.println("宝马工厂，把车造好了，返回给用户");
    }
}
