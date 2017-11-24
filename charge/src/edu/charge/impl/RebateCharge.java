package edu.charge.impl;

import edu.charge.Charge;
import edu.charge.FormDto;

/**
 * 返利
 */
public class RebateCharge implements Charge {

    @Override
    public double charge(FormDto params) {
        if (params.getCash() >= params.getFullCash()) {
            return params.getCash() - params.getCash() / params.getFullCash() * params.getReturnCash();
        }
        return params.getCash();
    }
}
