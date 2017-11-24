package chain.demo2;

public class HandlerA implements Handler{

    @Override
    public void execute(int money, HandlerChain chain) {
        if(money <= 200){
            System.out.println("HandlerA审批通过");
        }else{
            //放行，交给下一个人处理
            chain.doFilter(money);
        }
    }
}
