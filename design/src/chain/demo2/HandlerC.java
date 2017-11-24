package chain.demo2;

public class HandlerC implements Handler {

    @Override
    public void execute(int money, HandlerChain chain) {
        if(money <= 1000){
            System.out.println("HandlerC审批通过");
        }else{
            //放行，交给下一个人处理
            chain.doFilter(money);
        }
    }
}
