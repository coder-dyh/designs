package factory.absfactory;

import factory.OppoPad;
import factory.OppoPhone;
import factory.Pad;
import factory.Phone;

public class OppoFactory implements AbsFactory{
    @Override
    public Phone createPhone() {
        return new OppoPhone();
    }

    @Override
    public Pad createPad() {
        return new OppoPad();
    }
}
