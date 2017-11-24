package proxy.dymproxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        //创建一个字节码增强器,主要用于在运行时动态生成子类的字节码
        Enhancer eh = new Enhancer();
        //设置一个父类的Class对象
        eh.setSuperclass(People.class);
        //设置回调处理器
        eh.setCallback(new PeopleInterceptor(new People()));
        //创建代理实例(父类类型，子类对象),这个子类对象就是一个代理
        People p = (People) eh.create();
        p.work();
    }
}
