package factory.factorymethod;

import factory.OppoPhone;
import factory.Phone;

/**
 * Oppo手机工厂
 */
public class OppoPhoneFactory implements PhoneFactory{

    @Override
    public Phone createPhone() {
        return new OppoPhone();
    }
}
