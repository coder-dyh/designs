package factory.absfactory;

import factory.Pad;
import factory.Phone;

/**
 * 抽象工厂，创建产品族
 */
public interface AbsFactory {

    //生产手机
    Phone createPhone();

    //生产平板
    Pad createPad();

}
