package proxy.dymproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 回调处理器，负责调用目标对象的行为
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 定义一个目标对象，这个目标对象可以是任意的对象
     */
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    /**
     *  invoke方法是实现自InvocationHandler接口的，
     *  顾名思义，在实现这个方法中就是要去调用目标对象的行为。
     *  这个方法有三个参数：
     *  1. proxy，这个就是有jvm在运行时动态创建出来的代理对象
     *  2. method, 这个参数就是目标对象具体要调用的方法
     *  3. args, 这个就是目标对象方法调用时所需要的参数
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("work".equals(method.getName())){
            before();
            //调用目标对象的方法，通过反射来调用
            Object returnVal = method.invoke(target, args);
            after();
            return returnVal;
        }
        return method.invoke(target, args);
    }

    /**
     * 回调之前执行的方法
     */
    private void before(){
        System.out.println("调用之前...");
    }

    /**
     * 回调之后执行的方法
     */
    private void after(){
        System.out.println("调用之后...");
    }

}
