package chain.demo2;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 处理链,类似于过滤器的过滤链
 */
public class HandlerChain {

    private Iterator<Handler> it;

    /**
     * 初始化责任链
     */
    public HandlerChain(){
        //使用SPI(Service Provider Interface)来进行动态服务发现
        it = ServiceLoader.load(Handler.class).iterator();
    }

    /**
     * 责任链维护
     */
    public void doFilter(int money){
        //如果有下一个处理者，则直接拿出来处理
        if(it.hasNext()){
            it.next().execute(money, this);
        }
    }
}
