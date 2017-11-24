package singleton;


/**
 * 单例模式
 * 饿汉式
 */
public class A {

    //定义一个自己
    private static A a = new A();

    //将构造方法私有化,禁止调用方使用new关键字进行调用
    private A(){
    }

    //提供一个获取实例a的方法
    public static A getInstance(){
        return a;
    }
}
