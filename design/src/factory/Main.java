package factory;


import factory.beanfactory.BeanFactory;
import factory.factorymethod.OppoPhoneFactory;
import factory.factorymethod.PhoneFactory;

public class Main {

    public static void main(String[] args) {
       /* Phone p = PhoneFactory.createPhone("mi");
        p.call();*/

       //创建Oppo工厂
       /*PhoneFactory factory = new OppoPhoneFactory();
       //通过oppo工厂创建oppo手机
       Phone phone = factory.createPhone();
       phone.call();*/

       Phone phone = BeanFactory.getBean("factory.MiPhone");
       phone.call();
    }
}
