package factory.containerfactory;

import factory.Phone;

public class Main {

    public static void main(String[] args) {
        //创建工厂
        ContainerFactory factory = new ContainerFactory("beans.xml");

        Phone phone1 = factory.getBean("oppoPhone", Phone.class);
        Phone phone2 = factory.getBean("oppoPhone", Phone.class);
        System.out.println(phone1 == phone2);
        //phone1.call();
    }
}
