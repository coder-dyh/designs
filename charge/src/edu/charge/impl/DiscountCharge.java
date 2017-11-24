package edu.charge.impl;

import edu.charge.Charge;
import edu.charge.FormDto;

/**
 * 打折
 */
public class DiscountCharge implements Charge {

    @Override
    public double charge(FormDto params) {
        return params.getCash() * params.getDiscount();
    }
}
