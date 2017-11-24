package edu.charge;

import edu.charge.impl.RebateCharge;

public class Main {

    public static void main(String[] args) {
        FormDto params = new FormDto();
        //设置收费类型
        params.setChargeType("rebate");
        //设置支付现金
        params.setCash(400);
        //设置满额度
        params.setFullCash(200);
        //设置返额度
        params.setReturnCash(50);

        //创建收费服务
        ChargeService service = new ChargeService(params);
        //执行收费计算
        double money = service.account();
        System.out.println("实收："+money);
    }
}
