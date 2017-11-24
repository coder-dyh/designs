package service.impl;

import model.Post;
import service.WagePayment;

public class SalesWagePayment implements WagePayment {

    @Override
    public double payment(Post post) {
        int salesVol = (Integer) post.getProperty("salesVal");
        double commission = (Double) post.getProperty("commission");
        double wage = (Double) post.getProperty("wage");
        return wage + salesVol * commission;
    }
}
