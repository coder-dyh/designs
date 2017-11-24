package chain.demo2;

public class HandlerB implements Handler{
    @Override
    public void execute(int money, HandlerChain chain) {
        if(money <= 500){
            System.out.println("HandlerB审批通过");
        }else{
            //放行，交给下一个人处理
            chain.doFilter(money);
        }
    }
}
