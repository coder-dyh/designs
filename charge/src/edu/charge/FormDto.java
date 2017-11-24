package edu.charge;

public class FormDto {
    //收费类型
    private String chargeType;
    //现金
    private double cash;
    //折扣率
    private double discount;
    //满额度
    private int fullCash;
    //返额
    private int returnCash;

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getFullCash() {
        return fullCash;
    }

    public void setFullCash(int fullCash) {
        this.fullCash = fullCash;
    }

    public int getReturnCash() {
        return returnCash;
    }

    public void setReturnCash(int returnCash) {
        this.returnCash = returnCash;
    }
}
