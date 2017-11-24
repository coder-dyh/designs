package proxy.dymproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义一个拦截器，
 * 其实这个和JDK动态代理的回调处理器是一样的意思
 */
public class PeopleInterceptor implements MethodInterceptor {

    private Object target;

    public PeopleInterceptor(Object target){
        this.target = target;
    }

    /**
     * 这个方法和InvocationHandler的invoke方法作用一样
     * @param proxy CGLIB运行时创建的代理实例
     * @param method 表示目标对象正在调用的方法
     * @param objects 表示目标对象正在调用的方法所需的参数
     * @param methodProxy 目标对象方法的代理实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object ret = null;
        before();
        //由于这个代理对象是目标对象的子类，所以这里回调的时候是用invokeSuper方法
        //去调用父类中的行为
        ret = methodProxy.invokeSuper(proxy, objects);
        after();
        return ret;
    }

    /**
     * 目标对象执行前
     */
    private void before(){
        System.out.println("before...");
    }

    /**
     * 目标对象执行后
     */
    private void after(){
        System.out.println("after...");
    }
}
