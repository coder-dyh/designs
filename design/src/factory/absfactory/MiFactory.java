package factory.absfactory;

import factory.MiPad;
import factory.MiPhone;
import factory.Pad;
import factory.Phone;

public class MiFactory implements AbsFactory{
    /**
     * 生产小米手机
     * @return
     */
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    /**
     * 生产小米的平板
     * @return
     */
    @Override
    public Pad createPad() {
        return new MiPad();
    }
}
