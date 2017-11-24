package factory.factorymethod;

import factory.MiPhone;
import factory.Phone;

/**
 * 小米手机工厂
 */
public class MiPhoneFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
