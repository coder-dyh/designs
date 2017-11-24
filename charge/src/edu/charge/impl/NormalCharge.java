package edu.charge.impl;

import edu.charge.Charge;
import edu.charge.FormDto;

/**
 * 正常收费
 */
public class NormalCharge implements Charge {

    @Override
    public double charge(FormDto params) {
        return params.getCash();
    }
}
