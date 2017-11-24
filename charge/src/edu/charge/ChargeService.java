package edu.charge;

import edu.charge.impl.DiscountCharge;
import edu.charge.impl.NormalCharge;
import edu.charge.impl.RebateCharge;
import edu.charge.utils.PropertiesUtil;

public class ChargeService {

    /**
     * 定义抽象的收费接口,
     */
    private Charge charge;

    /**
     * 收费实现类换算时所需的参数
     * @param params
     */
    private FormDto params;

    /**
     * 依据不同的收费类型创建不同的收费实现类
     * @param params
     */
    public ChargeService(FormDto params){
        this.params = params;
        try {
            //根据类型从properties文件中获取相应的完整类名
            String className = PropertiesUtil.getProperty(params.getChargeType());
            //加载Class，并实例化对象
            charge = (Charge) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Class not found.", e);
        }
    }

    /**
     * 计算，并返回结果
     * @return
     */
    public double account() {
        return charge.charge(params);
    }
}
