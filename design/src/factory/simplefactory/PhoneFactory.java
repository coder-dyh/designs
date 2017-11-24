package factory.simplefactory;

import factory.MiPhone;
import factory.OppoPhone;
import factory.Phone;

/**
 * 简单工厂
 */
public class PhoneFactory {

    /**
     *
     * @param name 需要创建的手机的名称
     * @return 返回的是一个父类类型
     */
    public static Phone createPhone(String name){
        Phone phone = null;
        if("oppo".equals(name)){
            phone = new OppoPhone();
        }else if("mi".equals(name)){
            phone = new MiPhone();
        }
        return phone;
    }
}
