package chain.demo1;

public class HandlerA extends AbstractHandler {

    @Override
    public void execute(int money) {
        if(money <= 200){
            System.out.println("HandlerA审批通过");
        }else{
            //交给下一个人处理
            if(getHandler() != null){
                getHandler().execute(money);
            }
        }
    }
}
