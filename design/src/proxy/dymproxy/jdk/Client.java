package proxy.dymproxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 使用JDK提供的动态代理机制
 * 1. Proxy类，这个类专门用于动态创建代理对象的
 * 2. InvocationHandler接口（回调处理器）
 * 回调处理器的作用就是负责调用目标对象具体的行为
 */
public class Client {

    public static void main(String[] args) throws Exception{
       /* MyInterface inf = new Target();
        inf.work();*/

       //1. 创建一个具体的回调处理器，由我们自己来实现的
        InvocationHandler handler = new MyInvocationHandler(new Target());
       //2. 通过Proxy类来动态创建一个代理对象
        /**
         * 参数1：需要传递一个当前的类加载器
         * 参数2：需要目标对象实现的所有接口
         * 参数3：需要一个回调处理器
         */
        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(Client.class.getClassLoader(), Target.class.getInterfaces(), handler);

        //proxy.work();
        //proxy.say();

        //使用代理生成器来动态创建一个代理的字节码数组
        byte[] bytes = ProxyGenerator.generateProxyClass(proxy.getClass().getName(),
                new Class<?>[]{MyInterface.class});
        //将字节数组生成class文件写入磁盘
        FileOutputStream fos = new FileOutputStream(proxy.getClass().getSimpleName() + ".class");
        fos.write(bytes);
        fos.flush();
        fos.close();

    }
}
